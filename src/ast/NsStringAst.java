package ast;

/**
 *
 * @author hexaredecimal
 */
public class NsStringAst extends Ast {
	String value; 
	int length; 

	public NsStringAst(String value) {
		this.value = value; 
		this.length = value.length();
	}

	@Override
	public String toString() {
		return this.value; 
	}
}
