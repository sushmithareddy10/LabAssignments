/**
 * Author: Sushmitha
 * Date: 23/10/2020
 * Description: CarParking where we ParkCar, GetCar and show available ParkingSlots
 */

import java.util.*;

//Creating CarDetails using Employee class
class Employee{
	private String ownerName;
	private int carNumber;
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
	public Employee(String ownerName, int carNumber) {
		super();
		this.ownerName = ownerName;
		this.carNumber = carNumber;
	}
	public Employee() {
		
	}
	
}
public class CarParking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean t=true;
		Employee arr[][]=new Employee[5][];
		arr[0]=new Employee[10];
		arr[1]=new Employee[7];
		arr[2]=new Employee[5];
		arr[3]=new Employee[2];
		arr[4]=new Employee[1];
		
	 while(t) {
			System.out.println("1. Park Car");
			System.out.println("2. Get Car");
			System.out.println("3. Show Available Parking Slots\n");
			System.out.println("4. Exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt(); sc.nextLine();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter the Owner name :");
				String ownerName=sc.nextLine();
				
				System.out.println("Enter car Registration number");
			    int carNumber=sc.nextInt();
			    Employee employee=new Employee(ownerName,carNumber);
			    addDetails(employee, arr);
			    break;
			    
			case 2:
				System.out.println("Enter the car number :");
				int carNum=sc.nextInt();
				getCar(arr,carNum);
				break;
				
			case 3:
				int slots=getAvailableSlots(arr);
				System.out.println("The number of Available slots are: "+slots);
				break;
				
			case 4: 
				t=false;
				break;
				
			    
			}
	 }


		
	}
    
	//Checking for number of slots available
	private static int getAvailableSlots(Employee[][] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==null) {
					count++;
				}
			}
		}
		
		return count;
	}
  
	//Checking if the car is present for given Car Number
	private static void getCar(Employee[][] arr, int carNum) {
		outerloop: for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]!=null) {
					Employee obj=arr[i][j];
					int regNo=obj.getCarNumber();
					if(regNo==carNum) {
						System.out.println("There is a car with this number!");
					}
					arr[i][j]=null;
					break outerloop;
				}
				else {
					System.out.println("There is car with this Number");
				}
			}
		}
		
	}
	
   //Checking if the parking is slot is available or not
	private static void addDetails(Employee employee, Employee[][] arr) {
		int counter=0;
		outerloop: for (int i = 0; i < arr.length; i++) {  
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == null) { //if the parking is empty
					arr[i][j] = employee;  //assigns the car to the parking space
					counter=1;
					break;
					
					
				}
			}
			if(counter==1)
				break;
		}
	}
}

