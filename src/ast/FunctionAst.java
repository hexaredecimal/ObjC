package ast;

import java.util.List;
import java.util.stream.Collectors;
import rtc.Type;

/**
 *
 * @author hexaredecimal
 */
public class FunctionAst extends Ast {
	private List<ParamAst> params; 
	private String name; 
	private Type type;

	public FunctionAst(String name, List<ParamAst> params) {
		this.name = name; 
		this.params = params;
		this.type = null;
	}

	public void setType(Type type) {
		this.type
						= type;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		int size = params.size();
		for (int i = 0; i < size; i++) {
			sb = sb.append(this.params.get(i));
			if (i < size - 1) {
				sb = sb.append(",");
			}
		}
		sb = sb.append(")");
		
		String args = sb.toString(); 
		String _type = this.type == null ? "Type" : this.type.toString();
		String fmt = this.name + " " + args; 
		return String.join(" ", _type, fmt);
	}
}
