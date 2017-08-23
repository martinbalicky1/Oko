package exception;

public class DimensionsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DimensionsException(String error) {
		System.err.println(error);
	}
}
