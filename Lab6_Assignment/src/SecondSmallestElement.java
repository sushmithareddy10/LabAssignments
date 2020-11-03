
/**
 * Creating the class SecondSmallest element by accepting array and converting it to list and applying the sort 
 * @author SUSHMITHA
 *
 */
import java.util.*;

public class SecondSmallestElement {

	public static void main(String[] args) {
		/**
		 * creating an Integer array to store the integer values
		 */
		int[] numbers = { 4, 2, 6, 5, 1 };
		/**
		 * calling getScondSmallest method
		 * 
		 * @param numbers
		 */
		int result = getSecondSmallest(numbers);
		/**
		 * displaying the result
		 */
		System.out.println(result);

	}

	/**
	 * creating method getSecondSmallest by accepting array and converting it to
	 * list and applying the sort
	 * 
	 * @param numbers
	 * @return
	 */
	private static int getSecondSmallest(int[] numbers) {
		/**
		 * creating numberList for storing the array elements into list
		 */
		List<Integer> numberList = new ArrayList<>();
		/**
		 * looping through the array and adding the elements to list
		 */
		for (int i = 0; i < numbers.length; i++) {
			numberList.add(numbers[i]);
		}
		/**
		 * sorting the elements using the collection sort
		 */
		Collections.sort(numberList);
		/**
		 * returning the secondElement
		 */
		return numberList.get(1);
	}

}
