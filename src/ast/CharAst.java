package ast;

import ast.Ast;

/**
 *
 * @author hexaredecimal
 */
public class CharAst extends Ast {
	private char c;
	
	public CharAst(String text) {
		this.c = text.charAt(0);
	}

	@Override
	public String toString(){
		return String.format("'%c'", c);
	}	
	
}
