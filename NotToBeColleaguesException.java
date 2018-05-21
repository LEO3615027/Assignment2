package MyException;
/**
 * ’‚ «NotToBeColleaguesException class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
public class NotToBeColleaguesException extends Exception {
	/*when trying to connect a child in a colleague relation.*/
	public NotToBeColleaguesException() {}
	public NotToBeColleaguesException(String message) {
		super(message);
	}
}
