package myException;
/**
 * ’‚ «NoAvailableException class
 * @author JINDONG ZHANG
 * @version	V1.0
 */
/*
 * java.lang.Exception*/
public class NoAvailableException extends Exception {
	/*when trying to make two adults a couple and at least one of
	 *  them is already connected with another adult as a couple.*/
	public NoAvailableException(){}
	public NoAvailableException(String message){
		super(message);
	}
}
