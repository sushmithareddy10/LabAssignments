/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description:  A string is considered a positive string, if on moving from 
 *               left to right each character in the String comes after the previous 
 *               characters in the Alphabetical order.
 */
import java.util.*;
public class PositiveString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char alpha[]=  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		//Scanning input from User
		String string=sc.nextLine();
		
		//calling checkString method
		boolean t=checkString(string,alpha);
		if(t) {
			System.out.println("Positive String");
		}
		else {
			System.out.println("Not a Positive String");
		}
		

	}
    //Checking where the given String is Positive String or not
	private static boolean checkString(String string, char alpha[]) {
		int index=0;
		int count=0;
		int flag=0;
		char charArray[]=string.toCharArray();
		for(int i=1;i<charArray.length;i++) {
			count=0;
			for(int j=0;j<alpha.length;j++) {
				if(charArray[i]==alpha[j]) {
			          index=j;
				}
			}
			
			for(int k=0;k<=index;k++) {
				char c= charArray[i-1];
				if(c==alpha[k]) {
					count++;
				}
			}
			if(count==0) {
				flag=1;
				break;
			}
		}
				
		if(flag==1) {
			return false;
		}
		return true;
	}

}
