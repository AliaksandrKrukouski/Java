package by.krukouski.train.exception;

public class InvalidWagonTypeException extends Exception {

	private static final long serialVersionUID = 2L;

	public InvalidWagonTypeException() {}
	
	public InvalidWagonTypeException(String message) {
		super(message);
	}
	
	public InvalidWagonTypeException(Throwable exception) {
		super(exception);
	}
	
	public InvalidWagonTypeException(String message, Throwable exception) {
		super(message, exception);
	}

}
