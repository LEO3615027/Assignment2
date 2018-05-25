package myException;
/**
 * ’‚ «TooYoungException class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
public class TooYoungException extends Exception{
	/*when trying to make friend with a young child.*/
	public TooYoungException() {}
	public TooYoungException(String message) {
		super(message);
	}
}
