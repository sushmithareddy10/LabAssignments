/*
 * @Author : sushmitha
 * Creating InvalidAgeException class
 */
package demo1;

public class InvalidAgeException extends Exception {
	/**
	 * creating long final serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * creating parameterless constructor
	 */
	public InvalidAgeException() {
		/*
		 * calling super class
		 */
		super();
	}

	/*
	 * creating parameterized constructor for message of user defined exception
	 * 
	 * @param message
	 */
	public InvalidAgeException(String message) {
		/*
		 * calling super class
		 */
		super(message);
	}

}
