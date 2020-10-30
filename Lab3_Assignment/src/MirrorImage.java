
/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: Generate the mirror image of a String and add it to the existing string. 
 */
import java.util.*;

/*
 * creating class for MirrorImage
 */
public class MirrorImage {

	public static void main(String[] args) {
		/*
		 * creating class for scanner object
		 */
		Scanner sc = new Scanner(System.in);

		/*
		 * Scanning the input from User
		 */
		System.out.println("Enter the String for Mirror Image :");
		String string = sc.nextLine();

		/*
		 * Calling getImage method
		 * 
		 * @param string
		 */
		String reverse = getImage(string);

		/*
		 * Displaying the result
		 */
		System.out.println("The final Mirror Image is :");
		System.out.println(string + "|" + reverse);
		/*
		 * closing the scanner
		 */
		sc.close();

	}

	/*
	 * Generate the mirror image of a String and add it to the existing string.
	 */
	private static String getImage(String string) {
		/*
		 *creating the strinBuffer object
		 */
		StringBuffer sb = new StringBuffer(string);
		/*
		 * String reverse
		 */
		sb.reverse();
		/*
		 * converting to String return result;
		 */
		String result = sb.toString();
		/*
		 * returning the result
		 */
		return result;
	}

}
