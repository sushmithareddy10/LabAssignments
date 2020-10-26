/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: To return the command from URL
 *
 */
import java.util.*;
public class UrlCommand {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Scanning Input from User
		System.out.println("Enter the URL :");
		String url=sc.nextLine();
		
		//Calling getCommand method by sending URL as parameter
		String result=getCommand(url);
		
		//Displaying the result
		System.out.println("The command is :"+result);
	}
	
	//getCommand method returns the command
	private static String getCommand(String url) {
		String command=null;
		String word[]=url.split("/");          //splitting the URL by ("/")
		outerloop: for(int i=0;i<word.length;i++) {
			if(word[i].contains(".")) {
				command=word[i];
				break outerloop;
			}
		}
		
		char com[]=command.toCharArray();     //splitting the word that contains (".")
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<com.length;i++) {
			if(com[i]=='.') {
				break;
			}
			else {
				sb.append(com[i]);            //appending the characters until (".")
			}
		}
		
		String commands=sb.toString();
		return commands;                      //returning the string

	}
}
