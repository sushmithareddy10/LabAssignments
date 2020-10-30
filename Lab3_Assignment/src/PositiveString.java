
/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description:  A string is considered a positive string, if on moving from 
 *               left to right each character in the String comes after the previous 
 *               characters in the Alphabetical order.
 */
import java.util.*;

/*
 * creating class for positiveString
 */
public class PositiveString {

	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * declaring alpha array
		 */
		char alpha[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };

		/*
		 * Scanning input from User
		 */
		System.out.println("Enter the String :");
		String string = sc.nextLine();

		/*
		 * calling checkString method
		 * @param string,alpha
		 */
		boolean truth = checkString(string, alpha);
		/*
		 * checking the condition whether it is positive string or not
		 */
		if (truth) {
			System.out.println("Positive String");
		} else {
			System.out.println("Not a Positive String");
		}
		/*
		 * closing the scanner
		 */
		sc.close();

	}

	/*
	 * Checking whether the given String is Positive String or not
	 */
	private static boolean checkString(String string, char alpha[]) {
		/*
		 * declaring variables index, count , flag and assigning them to zero
		 */
		int index = 0;
		int count = 0;
		int flag = 0;
		/*
		 * creating character array byt converting string to charArray()
		 */
		char charArray[] = string.toCharArray();
		for (int i = 1; i < charArray.length; i++) {
			count = 0;
			for (int j = 0; j < alpha.length; j++) {
				/*
				 * checking if the element is in alpha array
				 */
				if (charArray[i] == alpha[j]) {
					/*
					 * getting index position of element
					 */
					index = j;
				}
			}

			for (int k = 0; k <= index; k++) {
				/*
				 * getting previous character
				 */
				char c = charArray[i - 1];
				/*
				 * checking if the character is present in the alpha array
				 */
				if (c == alpha[k]) {
					/*
					 * increment count if condition is true
					 */
					count++;
				}
			}
			/*
			 * if count is zero break the loop make flag 1
			 */
			if (count == 0) {
				flag = 1;
				break;
			}
		}

		if (flag == 1) {
			/*
			 * if flag is 1 there is no charcter present so return false
			 */
			return false;
		}
		/*
		 * if flag is 0 there is character so return true
		 */
		return true;
	}

}
