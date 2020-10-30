
/**
 *@Author: Sushmitha
 * Date: 24/10/2020
 * Description: Addition of String numbers
 */
import java.util.*;

/*
 * creating class AdditionOfStringNumbers
 */
public class AdditionOfStringNumbers {

	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * Scanning input from user
		 */
		System.out.println("Enter the numbers in string: ");
		String stringNumbers = sc.nextLine();
		/*
		 * splitting the string array using split method
		 */
		String numbers[] = stringNumbers.split(",");
		int sum = 0;
		/*
		 * looping through the array
		 */
		for (String i : numbers) {
			/*
			 * converting string to integer and adding
			 */
			sum = sum + Integer.parseInt(i);
		}

		/*
		 * displaying the result
		 */
		System.out.println("The sum of String NUmbers is :" + sum);
		/*
		 * closing the scanner
		 */
		sc.close();
	}
}
