package ast;

/**
 *
 * @author hexaredecimal
 */
public class BoolAst extends Ast {
	public static enum Value {
		TRUE, FALSE, YES, NO
	}; 

	private Value value; 

	public BoolAst(Value value) {
		this.value = value; 
	}

	@Override
	public String toString() {
		var val = this.value.toString(); 
		return (this.value == Value.TRUE || this.value == Value.FALSE) ? val.toLowerCase() : val.toUpperCase();
	}
}
