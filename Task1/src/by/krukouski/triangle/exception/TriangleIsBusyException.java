package by.krukouski.triangle.exception;

public class TriangleIsBusyException extends Exception {
	private static final long serialVersionUID = 4L;

	public TriangleIsBusyException() {}

	public TriangleIsBusyException(String message) {
		super(message);
	}

	public TriangleIsBusyException(Throwable exception) {
		super(exception);
	}

	public TriangleIsBusyException(String message, Throwable exception) {
		super(message, exception);
	}
}
