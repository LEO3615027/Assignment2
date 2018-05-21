package MyException;
/**
 * ’‚ «NotToBeClassmatesException class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
public class NotToBeClassmatesException extends Exception {
	/*when trying to make a young child in a classmate relation.*/
	public NotToBeClassmatesException() {}
	public NotToBeClassmatesException(String message) {
		super(message);
	}
}
