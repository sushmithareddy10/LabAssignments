/**
 * Author: Sushmitha
 * Date: 23/10/2020
 * Description: Concatenate the two arrays 
 */
import java.util.*;
public class NameAndSalutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Creating Array
		String arr[][]=new String[2][];
		arr[0]= new String[] {"mr","mrs","miss"};
		arr[1]= new String[] {"Prateek","Praveen","Aishwarya","Surya","Somesh","Dishanth"};
		for(int i=0;i<6;i++) {
			if(arr[1][i]=="Prateek" || arr[1][i]=="Dishanth" || arr[1][i]=="Somesh"|| arr[1][i]=="Praveen") {
				System.out.println(arr[0][0]+" "+arr[1][i]);
			}
			else if(arr[1][i]=="Aishwarya") {
				System.out.println(arr[0][2]+" "+arr[1][i]);
			}
			else if(arr[1][i]=="Surya") {
				System.out.println(arr[0][1]+" "+arr[1][i]);
			}
		}
		
		

	}

}
