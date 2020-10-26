/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: Finding Number of lines, Number of Words, Number of Characters in a text
 *
 */
import java.util.*;
public class NumbeOfLines {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Enter the text
		System.out.println("Enter the text :");
		int count=0, character=0;
		String string=null;
		StringBuffer sb=new StringBuffer();
		
		//Scanning for lines and appending with string buffer with space
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			if(line!=null && line.isEmpty()) {
				break;
			}
			count++;
			sb.append(line+" ");
		}
		
		//converting to string
		string=sb.toString();
		
		//Displaying the output
		System.out.println(string);
		
		//Checking for number of characters
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)>='a' && string.charAt(i)<='z') {
				character++;
			}
		}
		
		//Checking for number of words
		String temp[]=string.split(" ");
		int words=temp.length;
		
		System.out.println("Number of Lines :"+count);  //displaying the count
		System.out.println("Number of characters :"+character); //displaying the character
		System.out.println("Number of words :"+words);       //displaying the words
	}

}
