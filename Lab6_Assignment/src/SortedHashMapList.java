import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * @Author : susmitha
 * Creating class SortedHashMap to sort HashMap and return it as List
 */
public class SortedHashMapList {

	public static void main(String[] args) {
		/**
		 * Creating HashMap of Integer and String as Key value pair
		 */
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		/**
		 * adding values to the Hashmap
		 */
		hashmap.put(1, "Sush");
		hashmap.put(2, "Aishu");
		hashmap.put(3, "Akhi");
		hashmap.put(4, "hari");
		/**
		 * creating list to store the sorted values from hashMap
		 */
		List<String> SortedList = new ArrayList<String>();
		/**
		 * creating a method getValue method and store the returned in List
		 * @param hashMap
		 */
		SortedList = getValues(hashmap);
		/**
		 * Displaying the sorted value from list
		 */
		System.out.println(SortedList);

	}
	/**
	 * creating method getValues to accept hashMap and return the hashMap values in sorted order as list
	 * @param hashmap
	 * @return
	 */
	private static List<String> getValues(HashMap<Integer, String> hashmap) {
		/**
		 * Creating list of Array for storing string values from hash map
		 */
		List<String> sortedList = new ArrayList<String>();
		/**
		 * creating Foreach for looping through HashMap
		 */
		for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
			/**
			 * storing the value into the sortedList
			 */
			sortedList.add(entry.getValue());
		}
		/**
		 * sorting the list using the Collection.sort method
		 */
		Collections.sort(sortedList);
		/**
		 * returning the list of sorted elements
		 */
		return sortedList;
	}

}
