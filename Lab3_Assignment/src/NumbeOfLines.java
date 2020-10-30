
/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: Finding Number of lines, Number of Words, Number of Characters in a text
 *
 */
import java.util.*;

/*
 * creating class NumberOfLines
 */
public class NumbeOfLines {

	public static void main(String[] args) {
		/*
		 * creating the scanner object
		 */
		Scanner sc = new Scanner(System.in);

		/*
		 * scanning the input from user
		 */
		System.out.println("Enter the text :");
		int count = 0, character = 0;
		String string = null;
		/*
		 * creating string buffer object
		 */
		StringBuffer sb = new StringBuffer();

		/*
		 * Scanning for lines and appending with string buffer with space
		 */
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			/*
			 * checking if line is null or empty
			 */
			if (line != null && line.isEmpty()) {
				break;
			}
			count++;
			/*
			 * appending the line which is not null
			 */
			sb.append(line + " ");
		}

		/*
		 * converting to string
		 */
		string = sb.toString();

		/*
		 * Displaying the output
		 */
		System.out.println(string);

		/*
		 * Checking for number of characters
		 */
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
				character++;
			}
		}

		/*
		 * Checking for number of words
		 */
		String temp[] = string.split(" ");
		int words = temp.length;
		/*
		 * displaying the count
		 */
		System.out.println("Number of Lines :" + count);
		/*
		 * displaying the character
		 */
		System.out.println("Number of characters :" + character);
		/*
		 * displaying the words
		 */
		System.out.println("Number of words :" + words);
		/*
		 * closing the scanner
		 */
		sc.close();
	}

}
