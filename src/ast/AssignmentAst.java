package ast;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hexaredecimal
 */
public class AssignmentAst extends Ast {
	private Ast lhs;
	private Ast rhs; 
	private String op; 

	public AssignmentAst(Ast lhs, Ast rhs) {
		this.lhs = lhs; 
		this.rhs = rhs;
		this.op = "=";
	}

	public AssignmentAst(Ast lhs, String op, Ast rhs) {
		this.lhs = lhs; 
		this.rhs = rhs;
		this.op = op;
	}

	public List<VariableAst> toVariable() {
		List<VariableAst> vars = new ArrayList<>();

		if (lhs instanceof IdentifierAst id) {
			var v = new VariableAst(id);
			if (rhs instanceof AssignmentAst other) {
				var ot = other.toVariable();
				vars.addAll(ot);
				v.setValue(ot.getFirst().getId());
			} else {
				v.setValue(rhs);
			}
			vars.add(v);
		}
		
		return vars;
	};

	@Override
	public String toString() {
		return String.format("%s %s %s", lhs, op, rhs);
	}
}
