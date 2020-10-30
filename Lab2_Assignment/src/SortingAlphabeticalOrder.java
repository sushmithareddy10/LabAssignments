
/**
 * Author: Sushmitha
 * Date: 23/10/2020
 * Description: Accept an array of String objects and sort in
     Alphabetical order.
 */
import java.util.*;

/*
 * creating sortingAlphabeticalOrder
 */
public class SortingAlphabeticalOrder {

	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);

		/*
		 * scanning input from the user
		 */
		System.out.println("Enter the number of Strings: ");
		int number = sc.nextInt();
		/*
		 * creating the string array
		 */
		String[] alphabets = new String[number];
		/*
		 * adding the elements to array scanning the from the user
		 */
		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = sc.next();
		}

		/*
		 * calling the sortStrings method
		 */
		String[] result = sortStrings(alphabets);
		/*
		 * displaying the result by converting to string
		 */
		System.out.println(Arrays.toString(result));

		/*
		 * finding the middle element
		 */
		int middle;
		/*
		 * if modulus of number is zero divide by two
		 */
		if (number % 2 == 0) {
			middle = number / 2;
		}
		/*
		 * if condition fails divide by 2 and add plus 1
		 */
		else {
			middle = (number / 2) + 1;
		}
		/*
		 * converting first half to upper case and second half to lower case
		 */
		for (int i = 0; i < middle; i++) {
			System.out.print(alphabets[i].toUpperCase());
		}
		for (int i = middle; i < number; i++) {
			System.out.print(alphabets[i].toLowerCase());
		}
		sc.close();

	}

	/*
	 * creating method sortStrings method to sort the objects in alphabetical order
	 */
	private static String[] sortStrings(String[] alphabets) {
		for (int i = 0; i < alphabets.length; i++) {
			for (int j = i + 1; j < alphabets.length; j++) {
				/*
				 * using conpareTo method to compare objects of string
				 */
				if (alphabets[i].compareTo(alphabets[j]) > 0) {
					/*
					 * applying bubble sort for sorting
					 */
					String s = alphabets[i];
					alphabets[i] = alphabets[j];
					alphabets[j] = s;
				}
			}
		}
		/*
		 * returning the sorted array
		 */
		return alphabets;
	}

}
