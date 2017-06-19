package by.krukouski.triangle.exception;

public class InvalidTriangleException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidTriangleException() {}
	
	public InvalidTriangleException(String message) {
		super(message);
	}
	
	public InvalidTriangleException(Throwable exception) {
		super(exception);
	}
	
	public InvalidTriangleException(String message, Throwable exception) {
		super(message, exception);
	}
}