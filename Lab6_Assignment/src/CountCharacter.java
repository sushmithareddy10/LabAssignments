
/**
 * 
 * @author SUSHMITHA
 *Creating class countCharacter to count the number of charcters present in array and return in the form hashMap key value pait
 */
import java.util.*;
import java.util.Map.Entry;

public class CountCharacter {

	public static void main(String[] args) {
		/**
		 * creating character array for storing character values in it
		 */
		char[] characters = { 'a', 'b', 'a', 'c', 'd', 'b' };
		/*
		 * calling the method countChars
		 * @param characters[]
		 */
		Map<Character, Integer> countCharacters = countChars(characters);
		/*
		 * displaying the hashMap
		 */
		System.out.println(countCharacters);
	}
	/**
	 * creating the countChars method to accept characters array and return the characters and their count as map
	 * @param characters
	 * @return
	 */
	private static Map<Character, Integer> countChars(char[] characters) {
		/**
		 * creating hashMap called map for storing the character along with count
		 */
		Map<Character, Integer> map = new HashMap<>();
		/**
		 * using for as outerloop to take each character for checking
		 */
		for (int i = 0; i < characters.length; i++) {
			/**
			 * declaring count variable to keep count of repeated characters
			 */
			int count = 0;
			/**
			 * inner loop for checking the character with particular character
			 */
			for (int j = 0; j < characters.length; j++) {
				/**
				 * if both the character are equal increment the count
				 */
				if (characters[i] == characters[j]) {
					count++;
				}
			}
			/**
			 * checking if the character already exists in map to remove duplicates
			 */
			if (!(map.containsKey(characters[i]))) {
				/**
				 * adding the character and the character count into the map
				 */
				map.put(characters[i], count);

			}
		}
		/**
		 * returning the map
		 */
		return map;
	}

}
