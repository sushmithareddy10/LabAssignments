
/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: To accept date and print the duration in days, months and years with regards to current system date.
 *
 */
import java.util.*;
/*
 * creating class DateFormat
 */
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DateFormat {

	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);

		/*
		 * scanning input from the user in the form of yyyy/MM/dd format
		 */
		System.out.println("Enter the date in yyyy/MM/dd format :");
		String userDate = sc.nextLine();

		/*
		 * taking the system date in the format yyyy/MM/dd
		 */
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		/*
		 * storing the value in the string variable systemDate
		 */
		String systemDate = dtf.format(now);

		/*
		 * displaying the result
		 */
		System.out.println(systemDate + "\n");

		/*
		 * calling the method getDuration
		 * 
		 * @param userDtae, systemDate
		 */
		String result = getDuration(userDate, systemDate);
		String date[] = result.split("-");

		/*
		 * Displaying the diference in years, months, days
		 */
		System.out.println("The difference in Years: " + date[0]);
		System.out.println("The difference in Months: " + date[1]);
		System.out.println("The difference in Days: " + date[2]);
		/*
		 * close the scanner
		 */
		sc.close();
	}

	/*
	 * To accept date and print the duration in days, months and years with regards
	 * to current system date.
	 */
	private static String getDuration(String userDate, String systemDate) {
		/*
		 * creating string buffer object
		 */
		StringBuffer sb = new StringBuffer();

		/*
		 * Splitting userDate and systemDate using "/"
		 */
		String user[] = userDate.split("/");
		String system[] = systemDate.split("/");

		/*
		 * Appending the difference to StringBuffer
		 */
		for (int i = 0; i < user.length; i++) {
			int difference = Math.abs((Integer.parseInt(user[i]) - Integer.parseInt(system[i])));
			sb.append(difference + "-");
		}
		/*
		 * return the result by converting from stringBuffer to string
		 */
		return sb.toString();
	}

}
