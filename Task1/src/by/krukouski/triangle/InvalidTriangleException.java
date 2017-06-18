package by.krukouski.triangle;

public class InvalidTriangleException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidTriangleException() {}
	
	public InvalidTriangleException(String message) {
		super(message);
	}
}