
/**
 * 
 * @author SUSHMITHA
 *Creating class StudentMedals to get marks of students and return the medals they got based on marks
 */
import java.util.*;

public class StudentMedals {

	public static void main(String[] args) {
		/**
		 * creating hashMap for storing the registrationNumber and marks of students
		 */
		Map<Integer, Integer> studentDetails = new HashMap<>();
		/**
		 * adding the values into the hashMap
		 */
		studentDetails.put(1001, 90);
		studentDetails.put(1002, 72);
		studentDetails.put(1003, 85);
		/**
		 * calling the method getStudents and storing in the hashMap
		 * 
		 * @param studentDetails
		 */
		Map<Integer, String> medalDetails = getStudents(studentDetails);
		/**
		 * displaying the student details
		 */
		System.out.println(medalDetails);

	}

	/**
	 * creating method studentDetails to get medals based on marks
	 * 
	 * @param studentDetails
	 * @return
	 */
	private static Map<Integer, String> getStudents(Map<Integer, Integer> studentDetails) {
		/**
		 * creating hashMap to store the details of medals based on marks
		 */
		Map<Integer, String> medalDetails = new HashMap<>();
		/**
		 * iterating through the student details to get medals based on marks
		 */
		for (Map.Entry<Integer, Integer> entry : studentDetails.entrySet()) {
			/**
			 * checking the marks and assigning the medals
			 */
			if (entry.getValue() >= 90) {
				medalDetails.put(entry.getKey(), "Gold");
			} else if (entry.getValue() >= 80 && entry.getValue() < 90) {
				medalDetails.put(entry.getKey(), "Silver");
			} else if (entry.getValue() >= 70 && entry.getValue() < 80) {
				medalDetails.put(entry.getKey(), "Bronze");
			}
		}
		/**
		 * returning the medalDetails
		 */
		return medalDetails;
	}

}
