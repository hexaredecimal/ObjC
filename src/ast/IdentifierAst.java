package ast;

/**
 *
 * @author hexaredecimal
 */
public class IdentifierAst extends Ast {
	private String id; 
	
	public IdentifierAst(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return this.id;
	}
}
