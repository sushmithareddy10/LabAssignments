/**
 * 
 * @author SUSHMITHA
 * creating class SquaresOfNumber to find the squares of number and return numbers and their squares in haspMap
 *
 */
import java.util.*;
public class SquaresOfNumber {

	public static void main(String[] args) {
		/**
		 * creating an Integer array for storing the integer number
		 */
		int[] numbers= {2, 6, 1, 3, 7};
		/*
		 * calling method getSquares and storing the returned values in map
		 * @param numbers[]
		 */
		Map<Integer,Integer> squareMap = getvalues(numbers);
		/*
		 * displaying the map
		 */
		System.out.println(squareMap);
	}
	/**
	 * creating the getValues method to find the squares of the numbers and return the numbers and squares in map 
	 * @param numbers
	 * @return
	 */
	private static Map<Integer, Integer> getvalues(int[] numbers) {
		/*
		 * creating hashMap to store the numbers and their squares
		 */
		Map<Integer,Integer> squareMap = new HashMap<>();
		/*
		 * looping through array to square the numbers and put it in hash map
		 */
		for(int i=0;i<numbers.length;i++) {
			/*
			 * storing the value in ith index in number
			 */
			int number= numbers[i];
			/*
			 * adding values in the map
			 */
			squareMap.put(number, (number*number));
		}
		/*
		 * returning the map
		 */
		return squareMap;
	}

}
