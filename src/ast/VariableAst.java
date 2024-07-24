package ast;

/**
 *
 * @author hexaredecimal
 */
public class VariableAst extends Ast {

	private TypeAst type;
	private IdentifierAst id;
	private Ast value;

	public VariableAst(IdentifierAst id) {
		this.type = null;
		this.id = id;
		this.value = null;
	}

	public VariableAst(TypeAst type, IdentifierAst id) {
		this.type = type;
		this.id = id;
		this.value = null;
	}

	public VariableAst(TypeAst type, IdentifierAst id, Ast value) {
		this.type = type;
		this.id = id;
		this.value = value;
	}

	public TypeAst getType() {
		return type;
	}

	public void setType(TypeAst type) {
		this.type = type;
	}

	public IdentifierAst getId() {
		return id;
	}

	public void setId(IdentifierAst id) {
		this.id = id;
	}

	public Ast getValue() {
		return value;
	}

	public void setValue(Ast value) {
		this.value = value;
	}


	@Override
	public String toString() {
		var t = this.type == null ? "int" : this.type.toString(); 
		var v = this.value == null ? ";" : "= ".concat(this.value.toString()).concat(";");

		return String.join(" ", t, this.id.toString(), v);
	}
}
