package MyException;
/**
 * ’‚ «NoSuchAgeException class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
public class NoSuchAgeException extends Exception {
	/*when trying to enter a person whose age is negative or over 150. 
	 * (You can treat age as integer)*/
	public NoSuchAgeException() {}
	public NoSuchAgeException(String message) {
		super(message);
	}
}
