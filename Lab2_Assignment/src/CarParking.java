
/**
 * @Author: Sushmitha
 * Date: 23/10/2020
 * Description: CarParking where we ParkCar, GetCar and show available ParkingSlots
 */

import java.util.*;

/*
 * creating class CarDetails
 */
class CarDetails {
	/*
	 * creating private variable ownername, carnumber
	 */
	private String ownerName;
	private int carNumber;

	/*
	 * setter and getters for private variables
	 */
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	/*
	 * parameterized constructor
	 * 
	 * @param ownerName, carNumber
	 */
	public CarDetails(String ownerName, int carNumber) {
		/*
		 * calling super class
		 */
		super();
		this.ownerName = ownerName;
		this.carNumber = carNumber;
	}

	/*
	 * default constructor
	 */
	public CarDetails() {

	}

}

/*
 * creating class CarParking
 */
public class CarParking {

	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * initilizing variable boolean variable to true
		 */
		boolean t = true;
		/*
		 * creating cardetails array
		 */
		CarDetails arr[][] = new CarDetails[5][];
		arr[0] = new CarDetails[10];
		arr[1] = new CarDetails[7];
		arr[2] = new CarDetails[5];
		arr[3] = new CarDetails[2];
		arr[4] = new CarDetails[1];
		/*
		 * creating menu for the user to select options
		 */

		while (t) {
			System.out.println("1. Park Car");
			System.out.println("2. Get Car");
			System.out.println("3. Show Available Parking Slots\n");
			System.out.println("4. Exit");
			System.out.println("Enter the choice");
			/*
			 * scanning input from user using scanner object
			 */
			int choice = sc.nextInt();
			sc.nextLine();

			/*
			 * using switch case for switching between choices
			 */
			switch (choice) {
			case 1:
				/*
				 * scanning input from user
				 */
				System.out.println("Enter the Owner name :");
				String ownerName = sc.nextLine();

				System.out.println("Enter car Registration number");
				int carNumber = sc.nextInt();
				/*
				 * creating object for CarDetails class and passing name and number as
				 * parameters
				 */
				CarDetails employee = new CarDetails(ownerName, carNumber);
				/*
				 * calling the addDetails method
				 * 
				 * @param employee , arr
				 */
				addDetails(employee, arr);
				break;

			case 2:
				/*
				 * scanning the input from the user using scanner object
				 */
				System.out.println("Enter the car number :");
				int carNum = sc.nextInt();
				/*
				 * calling the getCar method
				 * 
				 * @param arr, carNum
				 */
				getCar(arr, carNum);
				break;

			case 3:
				/*
				 * calling the getAvailableSlots
				 */
				int slots = getAvailableSlots(arr);
				System.out.println("The number of Available slots are: " + slots);
				break;

			case 4:
				/*
				 * making the boolean variable to false
				 */
				t = false;
				break;
			default:
				/*
				 * if the choice is wrong display message
				 */
				System.out.println("Enter correct choice");
				break;

			}
		}
		/*
		 * closing the scanner
		 */
		sc.close();

	}

	/*
	 * creating getAvailableSlots for returning the avaiable slots
	 */
	private static int getAvailableSlots(CarDetails[][] arr) {
		/*
		 * initializing integer variable count to zero
		 */
		int count = 0;
		/*
		 * looping through to find the slots are empty or not
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == null) {
					/*
					 * if the slot is null increment the count
					 */
					count++;
				}
			}
		}
		/*
		 * return the count
		 */
		return count;
	}

	/*
	 * creating getCar method to check if the given car number is available in the
	 * slots
	 */
	private static void getCar(CarDetails[][] arr, int carNum) {
		/*
		 * looping through for loop
		 */
		outerloop: for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				/*
				 * if slot is not empty check for car number
				 */
				if (arr[i][j] != null) {
					CarDetails obj = arr[i][j];
					int regNo = obj.getCarNumber();
					/*
					 * if car number matches display message
					 */
					if (regNo == carNum) {
						System.out.println("There is a car with this number!");
					}
					/*
					 * make it null after removing car from slot
					 */
					arr[i][j] = null;
					/*
					 * break the outer loop
					 */
					break outerloop;
				}
				/*
				 * if there is no car display this message
				 */
				else {
					System.out.println("There is no car with this Number");
				}
			}
		}

	}

	/*
	 * creating addDetails method for cheking the slot avilability and adding
	 * details
	 */
	private static void addDetails(CarDetails employee, CarDetails[][] arr) {
		/*
		 * creating integer variable count and value to zero
		 */
		int counter = 0;
		/*
		 * looping through for loop
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				/*
				 * check it the slot is empty
				 */
				if (arr[i][j] == null) {
					/*
					 * if condition is true add the cardetails
					 */
					arr[i][j] = employee;
					/*
					 * increment the counte value
					 */
					counter = 1;
					break;

				}
			}
			/*
			 * check if count value is equal to one to break outer loop
			 */
			if (counter == 1)
				break;
		}
	}
}

