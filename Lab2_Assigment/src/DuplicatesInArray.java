/**
 * Author: Sushmitha
 * Date: 23/10/2020
 * Description: Return the resulting array after reversing the numbers and sorting it 
 */
import java.util.*;
public class DuplicatesInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//User input
		System.out.println("Enter the number of elements : ");
		int number=sc.nextInt();
		
		//Declaring and initializing array
		int arr[]=new int[number];
		for(int i=0;i<number;i++) {
			arr[i]=sc.nextInt();
			}
		//sorting in Descending order
		int result[]=modifyArray(arr);
		for(int i=0;i<result.length;i++) {
			for(int j=i+1;j<result.length;j++) {
				if(result[i]<result[j]) {
					int temp=result[i];
					result[i]=result[j];
					result[j]=temp;
					
				}
			}
		}
		System.out.println("The Sorted array is:");
		for(int i=0;i< result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
// Return the resulting array after reversing the numbers and sorting it 
	private static int[] modifyArray(int[] arr) {
		int n=arr.length;
		int count=0;
		int sub[] = new int[n];
		for(int i=0;i<n;i++) {
			sub[i]=1;
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					sub[j]=0;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(sub[i]==1) {
				count++;
			}
		}
		
		int a[]=new int[count];
		int k=0;
		for(int i=0;i<n;i++) {
			if(sub[i]==1) {
				a[k]=arr[i];
				k++;
			}
		}
		
		
		
		return a;
	}

}
