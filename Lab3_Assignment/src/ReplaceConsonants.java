/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: To replace Consonants with next character
 */
import java.util.*;
public class ReplaceConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 
	 //Scanning input from User
	  String string=sc.nextLine().toLowerCase();
	  
	  //Calling Method
	  String result=alterString(string);
	  
	  //Displaying the result
	 System.out.println("The Resultant String is :"+result);
	}
	
	
	//To replace Consonants with next character
	private static String alterString(String string) {
		  char name[]=string.toCharArray();
			 char arr[]=new char[name.length];
			 
			 //Creating character array for alphabets
			 char alphabets[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			  
			  for(int i=0;i<name.length;i++) {
				  if(name[i]=='a' || name[i]=='e' || name[i]=='i' || name[i]=='o' || name[i]=='u') {
					  arr[i]=name[i];
					  
				  }
				  else {
					  for(int j=0;j<alphabets.length;j++) {
						  if(name[i]==alphabets[j]) {
							 arr[i]=alphabets[j+1];
						  }
					  }
				  }
			  }
			  String string1=new String(arr);  //converting character array to string;
			return string1;
	}

}
