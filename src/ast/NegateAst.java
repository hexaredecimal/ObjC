package ast;

/**
 *
 * @author hexaredecimal
 */
public class NegateAst extends Ast {
	private Ast value; 

	public NegateAst(Ast value) {
		this.value = value; 
	}

	@Override
	public String toString() {
		return "-".concat(value.toString());
	}
}
