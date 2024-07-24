package ast;


/**
 *
 * @author hexaredecimal
 */
public class ParamAst extends Ast {
	private TypeAst type; 
	private String id; 

	public ParamAst(TypeAst type, String id) {
		this.type = type; 
		this.id = id;
	}

	@Override
	public String toString() {
		return String.join(" ", type.toString(), id);
	}
}
