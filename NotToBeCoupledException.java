package MyException;
/**
 * ’‚ «NotToBeCoupledException class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
public class NotToBeCoupledException extends Exception {
	/*when trying to make a couple when at least 
	 * one member is not an adult.*/
	public NotToBeCoupledException() {}
	public NotToBeCoupledException(String message) {
		super(message);
	}
}
