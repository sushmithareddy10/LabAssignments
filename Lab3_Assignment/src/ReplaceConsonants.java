/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: To replace Consonants with next character
 */
import java.util.*;
/*
 * creating class replaceconsonants
 */
public class ReplaceConsonants {

	public static void main(String[] args) {
		/*
		 * creating scannerobject
		 */
		Scanner sc=new Scanner(System.in);
	 
	 /*
	  * Scanning input from User and convert it to lower case
	  */
	  String string=sc.nextLine().toLowerCase();
	  
	  /*
	   * Calling Method alterString
	   * @param string
	   */
	  String result=alterString(string);
	  
	  /*
	   * Displaying the result
	   */
	 System.out.println("The Resultant String is :"+result);
	 /*
	  * closing the scanner
	  */
	 sc.close();
	}
	
	
	/*
	 * To replace Consonants with next character
	 */
	private static String alterString(String string) {
		/*
		 * creating the character array by converting string to charArry()
		 */
		  char name[]=string.toCharArray();
		  /*
		   * creating character array for storing elements
		   */
			 char arr[]=new char[name.length];
			 
			 /*
			  * Creating character array for alphabets
			  */
			 char alphabets[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			  
			  for(int i=0;i<name.length;i++) {
				  /*
				   * if vowels are present add it to storing array
				   */
				  if(name[i]=='a' || name[i]=='e' || name[i]=='i' || name[i]=='o' || name[i]=='u') {
					  arr[i]=name[i];
					  
				  }
				  else {
					  for(int j=0;j<alphabets.length;j++) {
						  /*
						   * after looping through alphabet array if the element consonant is found replace it next element in alphabet array 
						   */
						  if(name[i]==alphabets[j]) {
							 arr[i]=alphabets[j+1];
						  }
					  }
				  }
			  }
			  /*
			   * converting character array to string;
			   */
			  String string1=new String(arr);  
			  /*
			   * returning the string
			   */
			return string1;
	}

}
