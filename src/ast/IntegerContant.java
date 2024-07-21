package ast;

/**
 *
 * @author hexaredecimal
 */
public class IntegerContant extends Ast {
	String num; 
	boolean signed; 

	public IntegerContant(String num) {
		this.num = num; 
		this.signed = true;
	}

	@Override
	public String toString() {
		return this.num + (this.signed ? "" : "u");
	}
}
