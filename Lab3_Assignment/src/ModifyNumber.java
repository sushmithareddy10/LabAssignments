/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: Accept a number and modify it such that the each of the digit in 
 *              the newly formed number is equal to the difference between two consecutive 
 *              digits in the original number
 */

import java.util.*;
public class ModifyNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//Scanning input from User
		System.out.println("Enter the number :");
		int number= sc.nextInt();
		
		//Calling method
		int result=modifyNumber(number);
		
		//Displaying Result
		System.out.println("The modified number is :"+result);
			
		}
	
	//Method for checking difference between consecutive numbers
	private static int modifyNumber(int number) {
		String res="";
		 StringBuffer sb=new StringBuffer();
		 String string= Integer.toString(number);
		 for(int i=0;i<string.length()-1;i++) {
			 int digit1=Integer.parseInt(String.valueOf(string.charAt(i)));
			 int digit2=Integer.parseInt(String.valueOf(string.charAt(i+1)));
			 
			 int difference=Math.abs(digit1-digit2);
			sb.append(difference);
			
		 }
		 
		 int finalResult=Integer.parseInt(sb.toString());			 
		return finalResult;
	}

}

