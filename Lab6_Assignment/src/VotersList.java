
/**
 * Creating class VotersList to accept Id, age as hashMap and return list of voters eligible with Id
 * @author SUSHMITHA
 *
 */
import java.util.*;

public class VotersList {

	public static void main(String[] args) {
		/**
		 * creating hashMap voterList for storing id and age of voters
		 */
		Map<Integer, Integer> voterDetails = new HashMap<>();
		/**
		 * adding details of voters like voterId and Age
		 */
		voterDetails.put(101, 23);
		voterDetails.put(102, 16);
		voterDetails.put(103, 28);
		voterDetails.put(104, 17);
		/**
		 * calling the votersList method
		 * 
		 * @param voterDetails
		 */
		List<Integer> voterList = votersList(voterDetails);
		/**
		 * displaying the result
		 */
		System.out.println(voterList);

	}

	/**
	 * creating method votersList to accept Id, age as hashMap and return list of
	 * voters eligible with Id
	 * 
	 * @param voterDetails
	 * @return
	 */
	private static List<Integer> votersList(Map<Integer, Integer> voterDetails) {
		/**
		 * creating list for voters to add Id who are eligible to vote
		 */
		List<Integer> voterList = new ArrayList<>();
		/**
		 * Iterating through map to find eligible voters whoes age is greater than 18
		 */
		for (Map.Entry<Integer, Integer> entry : voterDetails.entrySet()) {
			/**
			 * checking if age is greater than 18
			 */
			if (entry.getValue() > 18) {
				/**
				 * if condition is true add the Id to the list
				 */
				voterList.add(entry.getKey());
			}
		}
		/**
		 * returning the list
		 */
		return voterList;
	}

}
