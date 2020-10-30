/*
 * Creating EmployeeService class for Employee Insurance System which is Interface class
 * @Author : Susmitha
 */
package com.cg.eis.service;

/*
 * Importing employee class package
 */
import com.cg.eis.bean.Employee;

/**
 * Creating Interface for EmployeeService class
 * 
 */
public interface EmployeeService {

	/*
	 * Creating getUserDetails method for getting details form the user
	 */
	public Employee getUserDetails();

	/*
	 * creating findInsuranceScheme method for getting Scheme based on salary
	 */
	public void findInsuranceScheme(Employee employee);

	/*
	 * creating displayDetails method for displaying the details of user
	 */
	public void displayDetails(Employee employee);
}
