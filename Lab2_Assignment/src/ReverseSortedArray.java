
/**
 * Author: Sushmitha
 * Date: 23/10/2020
 * Description: Return the resulting array after reversing the numbers and sorting it 
 */
import java.util.*;

/*
 * creating the class ReverseSortedArray
 */
public class ReverseSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * scanning the input from the user
		 */
		System.out.println("Enter the number of elements :");
		int number = sc.nextInt();

		/*
		 * declaring an integer array
		 */
		int arr[] = new int[number];
		/*
		 * initializing values into the array sccned from the user
		 */
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		/*
		 * calling the getSorted method
		 * 
		 * @param result
		 */
		int result[] = getSorted(arr);

		/*
		 * displayin the result
		 */
		System.out.print("The resulted Sorted array is :");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
		/*
		 * closing the scanner
		 */
		sc.close();

	}

	/*
	 * creating the method getSorted for reversing the number and sorting the array
	 */
	private static int[] getSorted(int[] arr) {
		/*
		 * declaring the integer array for reverse
		 */
		int reverse[] = new int[arr.length];
		int j = 0;
		/*
		 * looping throught the array for reversing
		 */
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse[j] = arr[i];
			j++;
		}
		/*
		 * sorting the array
		 */
		for (int i = 0; i < reverse.length; i++) {
			for (int k = 0; k < reverse.length; k++) {
				if (reverse[i] < reverse[k]) {
					/*
					 * storing the value in temporary variable
					 */
					int temp = reverse[i];
					reverse[i] = reverse[k];
					reverse[k] = temp;
				}
			}
		}
		/*
		 * returning the reversed and sorted array
		 */
		return reverse;
	}

}
