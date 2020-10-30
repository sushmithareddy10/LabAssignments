
/**
 * @Author: Sushmitha
 * Date: 23/10/2020
 * Description: Concatenate the two arrays 
 */
import java.util.*;

/*
 * creating class NameAndSalutation
 */
public class NameAndSalutation {

	public static void main(String[] args) {
		/*
		 * creating string array
		 */
		String arr[][] = new String[2][];
		/*
		 * initializing the string values into the array
		 */
		arr[0] = new String[] { "mr", "mrs", "miss" };
		arr[1] = new String[] { "Prateek", "Praveen", "Aishwarya", "Surya", "Somesh", "Dishanth" };
		/*
		 * loop through the array of array String
		 */
		for (int i = 0; i < 6; i++) {
			/*
			 * checking for the values of Prateesk,Dishanth,Somesh,Praveen int the array
			 */
			if (arr[1][i] == "Prateek" || arr[1][i] == "Dishanth" || arr[1][i] == "Somesh" || arr[1][i] == "Praveen") {
				System.out.println(arr[0][0] + " " + arr[1][i]);
			}
			/*
			 * checking for the values of Aishwarya in the array
			 */
			else if (arr[1][i] == "Aishwarya") {
				System.out.println(arr[0][2] + " " + arr[1][i]);
			}
			/*
			 * checking for the values of Surya in the array
			 */
			else if (arr[1][i] == "Surya") {
				System.out.println(arr[0][1] + " " + arr[1][i]);
			}
		}

	}

}
