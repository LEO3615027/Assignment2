package MyException;
/**
 * ’‚ «NotToBeFriendsException class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
public class NotToBeFriendsException extends Exception {
	/*when trying to make an adult and a child friend or connect two
	children with an age gap larger than 3.*/
	public NotToBeFriendsException() {}
	public NotToBeFriendsException(String message) {
		super(message);
	}
}
