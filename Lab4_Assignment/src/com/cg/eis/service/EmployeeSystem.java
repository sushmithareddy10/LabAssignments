/*
 * Creating EmployeeSytem that implements EmployeeService
 */
package com.cg.eis.service;
import com.cg.eis.bean.Employee;
import java.util.*;

public class EmployeeSystem implements EmployeeService {
	/*
	 * Overriding the getUserDetails from EmployeeSevice class
	 */
	@Override
	public Employee getUserDetails() {
		Scanner sc = new Scanner(System.in);
		/*
		 * scanning Id from user
		 */
		System.out.println("Enter the Id:");
		int id = sc.nextInt();

		/*
		 * scanning name from user
		 */
		System.out.println("Enter the Name: ");
		String name = sc.next();
		/*
		 * scanning salary from user
		 */
		System.out.println("Enter the Salary");
		double salary = sc.nextDouble();

		System.out.println("Enter the Designation");
		String designation = sc.next();

		/*
		 * Creating object for Employee class
		 * 
		 * @param Id, Name, Salary, Designation
		 * 
		 */
		Employee employee = new Employee(id, name, salary, designation);
		return employee;
	}

	/*
	 * Overriding the findInsuranceScheme from EmployeeSevice class
	 */
	@Override
	public void findInsuranceScheme(Employee employee) {
		/*
		 * Checking if the salary lies between 10,000 and 30,000 then insurance scheme is silver
		 */
		if (employee.getSalary() >= 10000 && employee.getSalary() <= 30000) {
			employee.setInsuranceScheme("Silver");
		}
		/*
		 * checking if salary lies between 41,000 60,000 the insurance scheme is gold
		 */
		else if (employee.getSalary() >= 41000 && employee.getSalary() <= 60000) {
			employee.setInsuranceScheme("Gold");
		} 
		/*
		 * checking if salary is above 60,000 then insurance scheme is platinum
		 */
		else {
			employee.setInsuranceScheme("Platinum");
		}

	}

	/*
	 * Overriding the displayDetails from EmployeeSevice class
	 */
	@Override
	public void displayDetails(Employee employee) {
		/*
		 * Displaying the employee details using employee object
		 */
		System.out.println("-----------Employee Details--------------");
		System.out.println("Id :" + employee.getId());
		System.out.println("Name :" + employee.getName());
		System.out.println("Salary :" + employee.getSalary());
		System.out.println("Designation :" + employee.getDesignation());
		System.out.println("Insurance Scheme :" + employee.getInsuranceScheme());

	}

}
