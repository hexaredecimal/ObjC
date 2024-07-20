package rtc;

/**
 *
 * @author hexaredecimal
 */
public class UserType extends Type {
	private String id; 

	public UserType(String type) {
		this.id = type;
	}
	
	@Override
	public String toString() {
		return this.id;
	}
	
	@Override
	public boolean isSystemType() {
		return false;
	}
}
