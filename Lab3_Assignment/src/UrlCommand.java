
/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: To return the command from URL
 *
 */
import java.util.*;

/*
 * creating the class UrlCommand
 */
public class UrlCommand {

	public static void main(String[] args) {
		/*
		 * creating the scanner object
		 */
		Scanner sc = new Scanner(System.in);

		/*
		 * Scanning Input from User
		 */
		System.out.println("Enter the URL :");
		String url = sc.nextLine();

		/*
		 * Calling getCommand method by sending URL as parameter
		 * 
		 * @param url
		 */
		String result = getCommand(url);

		/*
		 * Displaying the result
		 */
		System.out.println("The command is :" + result);
		/*
		 * closing the scanner
		 */
		sc.close();
	}

	/*
	 * getCommand method returns the command
	 */
	private static String getCommand(String url) {
		/*
		 * declare a string command to null
		 */
		String command = null;
		/*
		 * plitting the URL by ("/")
		 */
		String word[] = url.split("/");
		outerloop: for (int i = 0; i < word.length; i++) {
			/*
			 * checking if word array contains dot
			 */
			if (word[i].contains(".")) {
				/*
				 * if condition is true assign word to command and break
				 */
				command = word[i];
				break outerloop;
			}
		}
		/*
		 * splitting the word that contains (".")
		 */
		char com[] = command.toCharArray();
		/*
		 * creating object for string buffer
		 */
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < com.length; i++) {
			/*
			 * after looping through array if array has dot in it break the loop
			 */
			if (com[i] == '.') {
				break;
			}
			/*
			 * if condition fails append the word to string buffer object
			 */
			else {
				/*
				 * appending the characters until (".")
				 */
				sb.append(com[i]);
			}
		}
		/*
		 * converting the object to string
		 */
		String commands = sb.toString();
		/*
		 * returning the string
		 */
		return commands;

	}
}
