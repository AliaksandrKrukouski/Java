package by.krukouski.train.exception;

public class FileNotExistsException extends Exception {
	private static final long serialVersionUID = 3L;

	public FileNotExistsException() {}
	
	public FileNotExistsException(String message) {
		super(message);
	}
	
	public FileNotExistsException(Throwable exception) {
		super(exception);
	}
	
	public FileNotExistsException(String message, Throwable exception) {
		super(message, exception);
	}
}