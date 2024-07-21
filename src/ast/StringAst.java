package ast;

/**
 *
 * @author hexaredecimal
 */
public class StringAst extends Ast {
	String value; 

	public StringAst(String value) {
		this.value = value; 
	}

	@Override
	public String toString() {
		return this.value; 
	}
}
