/**
 * Author: Sushmitha
 * Date: 23/10/2020
 * Description: Accept an array of String objects and sort in
     Alphabetical order.
 */
import java.util.*;
public class SortingAlphabeticalOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Taking Number of Strings from User
        System.out.println("Enter the number of Strings: ");
        int number=sc.nextInt();
        
        //Creating Array and Initializing elements
		String[] alphabets=new String[number];
		for(int i=0;i<alphabets.length;i++ ) {
			alphabets[i]=sc.next();
		}
		
		//Calling Method
		String[] result=sortStrings(alphabets);
		
		//Displaying sorted Array
		System.out.println(Arrays.toString(result));
		
		
		//Finding the middle element
		int middle;
		if(number%2==0) {
			middle=number/2;
		}
		else {
			middle=(number/2)+1;
		}
			//Converting first half to UpperCase and second half to LowerCase
			for(int i=0;i<middle;i++) {
				System.out.print(alphabets[i].toUpperCase());
			}
			for(int i=middle;i<number;i++) {
				System.out.print(alphabets[i].toLowerCase());
			}

	}
	
//accept an array of String objects and sort in Alphabetical order.

	private static String[] sortStrings(String[] alphabets) {
		for(int i=0;i<alphabets.length;i++) {
			for(int j=i+1;j<alphabets.length;j++) {
				if(alphabets[i].compareTo(alphabets[j])>0) {
					String s=alphabets[i];
					alphabets[i]=alphabets[j];
					alphabets[j]=s;
				}
			}
		}
		return alphabets;
	}

}
