/*
 * @Author : Sushmitha
 * Creating ValidateName class for checking whether full name and last name is null and throwing exception
 */
package demo2;

import java.util.*;

public class ValidateName {

	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		try {
			/*
			 * scanning first name from user
			 */
			System.out.println("Enter the first name :");
			String firstName = sc.nextLine();
			/*
			 * scanning last name from user
			 */
			System.out.println("Enter the last name :");
			String lastName = sc.nextLine();
			/*
			 * creating try catch block for checking whether first name and last name is
			 * null
			 */
			if (firstName.isEmpty() || lastName.isEmpty()) {
				/*
				 * throwing exception if first name is null and last name is null
				 */
				throw new InvalidNameException("Enter the name correctly");
			} else {
				/*
				 * if not null displaying the fullname
				 */
				System.out.println("The full name is :" + firstName + " " + lastName);
			}
			/*
			 * closing the scanner
			 */
			sc.close();

		} catch (InvalidNameException e) {
			/*
			 * displaying the message of exception
			 */
			System.out.println("The exception is :" + e.getMessage());
		}

	}

}
