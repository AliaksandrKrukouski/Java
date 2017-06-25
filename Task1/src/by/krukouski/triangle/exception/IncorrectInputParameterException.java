package by.krukouski.triangle.exception;

public class IncorrectInputParameterException extends Exception {
	private static final long serialVersionUID = 2L;

	public IncorrectInputParameterException() {}
	
	public IncorrectInputParameterException(String message) {
		super(message);
	}
	
	public IncorrectInputParameterException(Throwable exception) {
		super(exception);
	}
	
	public IncorrectInputParameterException(String message, Throwable exception) {
		super(message, exception);
	}
}