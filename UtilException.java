package by.epamtc.melnikov.onlineshop.util.exception;

/**
 * A class that inherits from {@link Exception}.
 * Describes an exception that can throws in util package.
 * 
 * @author nearbyall
 *
 */
public class UtilException extends Exception {

	private static final long serialVersionUID = 7262619792394758039L;

	public UtilException() {
		super();
	}

	public UtilException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UtilException(String message, Throwable cause) {
		super(message, cause);
	}

	public UtilException(String message) {
		super(message);
	}

	public UtilException(Throwable cause) {
		super(cause);
	}
	
}
