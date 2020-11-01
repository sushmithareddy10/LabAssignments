/*
 * @Author : Sushmitha
 * creating ValidateAgeOfPerson validate the age of a person and throw user defined exception
 */
package demo1;

import java.util.*;

public class ValidateAgeOfPerson {
	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * adding try catch block to validate the user and throw exception
		 */
		try {
			/*
			 * Scanning the input from user
			 */
			System.out.println("Enter the age for the user");
			int age = sc.nextInt();
			/*
			 * checking for exception and throwing exception
			 */
			if (age < 15) {
				/*
				 * throwing exception for invalid age <15
				 */
				throw new InvalidAgeException("Enter the age above 15");
			} else {
				System.out.println("The age of the person is :" + age);
			}
		} catch (InvalidAgeException e) {
			/*
			 * displaying the exception message
			 */
			System.out.println("The exception is  :" + e.getMessage());
		}
		/*
		 * closing the scanner
		 */
		sc.close();

	}

}
