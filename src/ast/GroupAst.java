package ast;

/**
 *
 * @author hexaredecimal
 */
public class GroupAst extends Ast {
	private Ast value;

	public GroupAst(Ast value) {
		this.value = value; 
	}

	@Override
	public String toString() {
		return String.format("(%s)", this.value.toString());
	}
} 
