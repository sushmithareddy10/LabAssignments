
/**
 * creating class ReverseSortNumbers to accept the Integer array, reverse it and sort the number 
 * @author SUSHMITHA
 *
 */
import java.util.*;

public class ReverseSortNumbers {

	public static void main(String[] args) {
		/**
		 * creating Integer array to store the elements
		 */
		int[] numbers = { 3, 2, 5, 1, 4 };
		/**
		 * calling getSorted method
		 * 
		 * @param numbers
		 */
		int result = getSorted(numbers);
		/**
		 * displayin the result
		 */
		System.out.println(result);

	}

	/**
	 * creating getSorted method to accept the Integer array, reverse it and sort
	 * the number
	 * 
	 * @param numbers
	 * @return
	 */
	private static int getSorted(int[] numbers) {
		/**
		 * creating string buffer
		 */
		StringBuffer stringbuffer = new StringBuffer();
		/**
		 * looping through numbers array and appendin the elements to string buffer
		 * object
		 */
		for (int i = 0; i < numbers.length; i++) {
			stringbuffer.append(numbers[i]);
		}
		/**
		 * reversing the appended string buffer object using reverse method
		 */
		stringbuffer.reverse();
		/**
		 * converting the string buffer to string
		 */
		String string = stringbuffer.toString();
		/**
		 * creating Integer list
		 */
		List<Integer> list = new ArrayList<>();
		/**
		 * looping through string and adding the elements into list
		 */
		for (int i = 0; i < string.length(); i++) {
			list.add(Integer.parseInt(string.valueOf(string.charAt(i))));
		}
		/**
		 * sorting the elements in the list using sort method from cillections
		 */
		Collections.sort(list);
		/**
		 * creating string buffer object
		 */
		StringBuffer stringsuffer1 = new StringBuffer();
		/**
		 * looping through the list and appending the elements
		 */
		for (Integer l : list) {
			stringsuffer1.append(l);
		}
		/**
		 * converting the string buffer to Integer number
		 */
		int result = Integer.parseInt(stringsuffer1.toString());
		/**
		 * returning the result
		 */
		return result;
	}

}
