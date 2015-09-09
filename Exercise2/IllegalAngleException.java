package practice.exercises.exercise2;

@SuppressWarnings("serial")
class IllegalAngleException extends IllegalArgumentException {

	/**
	 * Constructs a new IllegalAngleException with no detail message.
	 */
	public IllegalAngleException() {
		super();
	}

	/**
	 * Constructs a new IllegalAngleException with the specified detail message.
	 * 
	 * @param message
	 *            the detail message.
	 */
	public IllegalAngleException(String message) {
		super(message);
	}

	/**
	 * Constructs a new exception with the specified detail message and cause.
	 * 
	 * @param message
	 *            the detail message
	 * @param cause
	 *            the cause
	 */
	public IllegalAngleException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs a new exception with the specified cause and a detail message
	 * of (cause==null ? null : cause.toString())
	 * 
	 * @param cause
	 *            the cause
	 */
	public IllegalAngleException(Throwable cause) {
		super(cause);
	}

}
