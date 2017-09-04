package by.krukouski.multithread.exception;

public class EmptyFileException extends Exception {
 
	private static final long serialVersionUID = 1L;

	public EmptyFileException() {}
	
	public EmptyFileException(String message) {
		super(message);
	}
	
	public EmptyFileException(Throwable exception) {
		super(exception);
	}
	
	public EmptyFileException(String message, Throwable exception) {
		super(message, exception);
	}
}