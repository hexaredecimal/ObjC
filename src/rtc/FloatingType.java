package rtc;

/**
 * @author hexaredecimal
 */
public class FloatingType
				extends Type {

	private int size;

	public FloatingType(int size) {
		this.size =
						size;
	}

	public FloatingType(int size, boolean signed) {
		this.size =
						size;
	}


	@Override
	public String toString() {
		return String.join("f", String.valueOf(this.size));
	}

	@Override
	public boolean isSystemType() {
		return true;
	}
}
