/**
 * Author: Sushmitha
 * Date: 23/10/2020
 * Description: Return the resulting array after reversing the numbers and sorting it 
 */
import java.util.*;
public class ReverseSortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//User Input
		System.out.println("Enter the number of elements :");
		int number=sc.nextInt();
		
		//Declaring and Initializing array
		int arr[]=new int[number];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		//Calling Method
		int result[]=getSorted(arr);
		
		//Displaying Result
		System.out.print("The resulted Sorted array is :");
	    for(int i=0;i<result.length;i++) {
	    	System.out.print(result[i]);
	    }

	}

//	Return the resulting array after reversing the numbers and sorting it 
	private static int[] getSorted(int[] arr) {
		// TODO Auto-generated method stub
		int reverse[]=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			reverse[j]=arr[i];
			j++;
		}
		for(int i=0;i<reverse.length;i++) {
			for(int k=0;k<reverse.length;k++) {
				if(reverse[i]<reverse[k]) {
					int temp=reverse[i];
					reverse[i]=reverse[k];
					reverse[k]=temp;
				}
			}
		}
		return reverse;
	}


}
