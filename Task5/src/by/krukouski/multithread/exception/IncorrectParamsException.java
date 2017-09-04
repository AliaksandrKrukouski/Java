package by.krukouski.multithread.exception;

public class IncorrectParamsException extends Exception {

	private static final long serialVersionUID = 2L;

	public IncorrectParamsException() {}
	
	public IncorrectParamsException(String message) {
		super(message);
	}
	
	public IncorrectParamsException(Throwable exception) {
		super(exception);
	}
	
	public IncorrectParamsException(String message, Throwable exception) {
		super(message, exception);
	}
}
