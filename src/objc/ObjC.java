package objc;

import backend.Walker;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import parser.*;

/**
 *
 * @author hexaredecimal
 */
public class ObjC {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		CharStream input =
						CharStreams.fromFileName("test/0.m");

		ObjCLexer lexer =
						new ObjCLexer(input);
		CommonTokenStream tokens =
						new CommonTokenStream(lexer);

		ObjCParser parser = new ObjCParser(tokens);
		var program = parser.program();

		Walker walker = new Walker();
		walker.walkProgram(program);
	}
}
