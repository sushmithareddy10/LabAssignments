/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: Generate the mirror image of a String and add it to the existing string. 
 */
import java.util.*;
public class MirrorImage {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Scanning the input from User
		System.out.println("Enter the String for Mirror Image :");
		String string=sc.nextLine();
		
		//Calling getImage method
		String reverse=getImage(string);
		
		//Displaying the result
		System.out.println("The final Mirror Image is :");
		System.out.println(string+"|"+reverse);
		

	}
	
	// Generate the mirror image of a String and add it to the existing string. 
	private static String getImage(String string) {
		StringBuffer sb=new StringBuffer(string);
		sb.reverse();                   //String reverse
		String result=sb.toString();    //coverting to String
		return result;
	}

}
