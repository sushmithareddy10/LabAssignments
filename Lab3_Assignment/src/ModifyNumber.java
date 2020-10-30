
/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: Accept a number and modify it such that the each of the digit in 
 *              the newly formed number is equal to the difference between two consecutive 
 *              digits in the original number
 */

import java.util.*;

/*
 * creating the modifyNumber class
 */
public class ModifyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Scanning input from User
		 */
		System.out.println("Enter the number :");
		int number = sc.nextInt();

		/*
		 * Calling method
		 * 
		 * @param number
		 */
		int result = modifyNumber(number);

		/*
		 * Displaying Result
		 */
		System.out.println("The modified number is :" + result);
		/*
		 * closing the scanner
		 */
		sc.close();

	}

	/*
	 * Method for checking difference between consecutive numbers
	 */
	private static int modifyNumber(int number) {
		/*
		 * creating stringbuffer object
		 */
		StringBuffer sb = new StringBuffer();
		/*
		 * converting number to string
		 */
		String string = Integer.toString(number);
		for (int i = 0; i < string.length() - 1; i++) {
			/*
			 * converting it to integer
			 */
			int digit1 = Integer.parseInt(String.valueOf(string.charAt(i)));
			int digit2 = Integer.parseInt(String.valueOf(string.charAt(i + 1)));
			/*
			 * finding the difference
			 */
			int difference = Math.abs(digit1 - digit2);
			/*
			 * appending the difference using append method
			 */
			sb.append(difference);

		}
		/*
		 * converting string buffer object to string
		 */
		int finalResult = Integer.parseInt(sb.toString());
		/*
		 * returning final result
		 */
		return finalResult;
	}

}
