
/**
 * @author SUSHMITHA
 * Date: 23/10/2020
 * Description: removing the duplicates from array and sorting in descending order
 */
import java.util.*;

/*
 * creating class DuplicatesInArray
 */
public class DuplicatesInArray {

	public static void main(String[] args) {
		/*
		 * creating the scanner object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * scanning input from the user
		 */
		System.out.println("Enter the number of elements : ");
		int number = sc.nextInt();

		/*
		 * declaring array of integer
		 */
		int arr[] = new int[number];
		/*
		 * looping through array and scanning input from user
		 */
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		/*
		 * calling the modifyArray method and storing result in result array
		 * 
		 * @param arr[]
		 */
		int result[] = modifyArray(arr);
		/*
		 * sorting the resultant array in descending order
		 */
		for (int i = 0; i < result.length; i++) {
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] < result[j]) {
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;

				}
			}
		}
		/*
		 * displaying the result
		 */
		System.out.println("The Sorted array is:");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		/*
		 * closing the scanner
		 */
		sc.close();

	}

	/*
	 * creating modifyArray method to remove duplicates
	 */
	private static int[] modifyArray(int[] arr) {
		/*
		 * creating variables for length and count
		 */
		int n = arr.length;
		int count = 0;
		/*
		 * creating sub array of integer to have count of duplicates
		 */
		int sub[] = new int[n];
		/*
		 * fill the sub array with value 1
		 */
		for (int i = 0; i < n; i++) {
			sub[i] = 1;
		}
		/*
		 * looping through for loop
		 */
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				/*
				 * if both values ar equal mark the duplicate in subarray
				 */
				if (arr[i] == arr[j]) {
					sub[j] = 0;
				}
			}
		}
		/*
		 * count the number of duplicates in subarray
		 */
		for (int i = 0; i < n; i++) {
			if (sub[i] == 1) {
				count++;
			}
		}
		/*
		 * creating new array of integer for taking non duplicate elements
		 */
		int a[] = new int[count];
		int k = 0;
		for (int i = 0; i < n; i++) {
			if (sub[i] == 1) {
				a[k] = arr[i];
				k++;
			}
		}

		/*
		 * returning the array
		 */
		return a;
	}

}
