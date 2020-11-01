/*
 * @Author : Sushmitha
 * creating class InvalidNameException for catching exception
 */
package demo2;

public class InvalidNameException extends Exception {
	/**
	 * creating long final serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * creating parameterless constructor
	 */
	public InvalidNameException() {
		super();
	}

	/*
	 * creating parameterized constructor of user defined exception
	 * 
	 * @param message
	 */
	public InvalidNameException(String message) {
		/*
		 * calling super class
		 */
		super(message);
	}

}
