/*
 * @Author : Sushmitha
 * Creating EmployeeException class for user defined exception
 */
package com.cg.eis.exception;

public class EmployeeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * creating parameterless constructor
	 */
	public EmployeeException() {
		/*
		 * calling super class
		 */
		super();
	}

	/*
	 * creating parameterized constructor of user defined exception
	 * @param message
	 */
	public EmployeeException(String message) {
		/*
		 * calling super class
		 */
		super(message);
	}
}
