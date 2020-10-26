/**
 *@Author: Sushmitha
 * Date: 24/10/2020
 * Description: Addition of String numbers
 */
import java.util.*;
public class AdditionOfStringNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//Scanning input from User
		System.out.println("Enter the numbers in string: ");
		String stringNumbers=sc.nextLine();
		
		//Splitting the String to String Array
		String numbers[]=stringNumbers.split(",");
		int sum=0;
		
		//Looping through String Array 
		for(String i:numbers) {
			sum=sum+Integer.parseInt(i);
		}
		
		//Displaying the result
         System.out.println("The sum of String NUmbers is :"+sum);
	}

}
