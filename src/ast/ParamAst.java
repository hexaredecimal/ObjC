package ast;

import rtc.Type;

/**
 *
 * @author hexaredecimal
 */
public class ParamAst extends Ast {
	private Type type; 
	private String id; 

	public ParamAst(Type type, String id) {
		this.type = type; 
		this.id = id;
	}

	@Override
	public String toString() {
		return String.join(" ", type.toString(), id);
	}
}
