/**
 * Author: Sushmitha
 * Date: 23/10/2020
 * Description: To find the second smallest element from the array
 */
import java.util.*;
public class SecondSmallestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//User input
		System.out.println("Enter the Length :");
		int length=sc.nextInt();
		
		//Creating and Initialization of Array
		int arr[]=new int[length];
		
		//Accepting elements from user
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
			}
		
		//Calling method
		int secondSmallest=getSecondSmallest(arr);
		System.out.println("The second Smallest number is :"+secondSmallest);
		
	}

	//Get the second smallest element in the array 
	private static int getSecondSmallest(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			
		return arr[1];
	}

}
