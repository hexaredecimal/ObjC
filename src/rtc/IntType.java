package rtc;

/**
 * @author hexaredecimal
 */
public class IntType
				extends Type {

	private int size;
	private boolean signed;

	public IntType(int size) {
		this.size =
						size;
		this.signed =
						false;
	}

	public IntType(int size, boolean signed) {
		this.size =
						size;
		this.signed =
						signed;
	}

	public void setSigned(boolean signed) {
		this.signed = signed;
	}

	@Override
	public String toString() {
		String sign_symbol =
						this.signed ? "s" : "u";
		return String.join("", sign_symbol, String.valueOf(this.size));
	}

	@Override
	public boolean isSystemType() {
		return true;
	}
}
