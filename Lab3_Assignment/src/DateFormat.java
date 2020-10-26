/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: To accept date and print the duration in days, months and years with regards to current system date.
 *
 */
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class DateFormat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Scanning UserDate from user
		System.out.println("Enter the date in yyyy/MM/dd format :");
		String userDate=sc.nextLine();
		
		//Taking systemDate in format of "yyyy/MM/dd"
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now= LocalDateTime.now();	
		String systemDate=dtf.format(now);
		
		//Displaying systemDate
		System.out.println(systemDate+"\n");
		
		//calling getDuration method
		String result=getDuration(userDate,systemDate);
		String date[]=result.split("-");
		
		//Displaying difference in Years, Months, Days
		System.out.println("The difference in Years: "+date[0]);
		System.out.println("The difference in Months: "+date[1]);
		System.out.println("The difference in Days: "+date[2]);
	}

	private static String getDuration(String userDate, String systemDate) {
		StringBuffer sb= new StringBuffer();
		
		//Splitting userDate and systemDate using "/"
		String user[]=userDate.split("/");
		String system[]=systemDate.split("/");
		
		//Appending the difference to StringBuffer
		for(int i=0;i<user.length;i++) {
			int difference= Math.abs((Integer.parseInt(user[i])- Integer.parseInt(system[i])));
			sb.append(difference+"-");
		}
		
		return sb.toString();  //return String
	}

}
