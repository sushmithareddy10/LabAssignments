
/**
 * Author: Sushmitha
 * Date: 23/10/2020
 * Description: To find the second smallest element from the array
 */
import java.util.*;

/*
 * creating class secondSmallestElement
 */
public class SecondSmallestElement {

	public static void main(String[] args) {
		/*
		 * creating the scanner object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * Scanning the input from user using scanner object
		 */

		System.out.println("Enter the Length :");
		int length = sc.nextInt();
		/*
		 * creating an array of integer
		 */
		int arr[] = new int[length];
		/*
		 * accepting elements from user and assigning to array
		 */
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}

		/*
		 * calling the method getSecondSmallest
		 * 
		 * @param arr
		 */
		int secondSmallest = getSecondSmallest(arr);
		/*
		 * displaying the result
		 */
		System.out.println("The second Smallest number is :" + secondSmallest);
		/*
		 * closing the scanner
		 */
		sc.close();

	}

	/*
	 * creating the method getSecondSmallest element from array
	 */
	private static int getSecondSmallest(int[] arr) {
		/*
		 * looping through the array
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				/*
				 * checking if value is greater than next value
				 */
				if (arr[i] > arr[j]) {
					/*
					 * assigning values temporary variable
					 */
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		/*
		 * returning the second element from the sorted array
		 */
		return arr[1];
	}

}
