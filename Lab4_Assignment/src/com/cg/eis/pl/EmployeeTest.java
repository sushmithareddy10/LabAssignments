/*
 * Creating Employee Test class to test other classes
 * @Author : Susmitha
 */
package com.cg.eis.pl;

import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeSystem;

public class EmployeeTest {

	public static void main(String[] args) {

		/*
		 * Creating object for EmployeeSystem class for calling methods
		 */
		EmployeeSystem employeesystem = new EmployeeSystem();

		/*
		 * Calling getUserDetails method to get details from User
		 */
		Employee employee = employeesystem.getUserDetails();

		/*
		 * Calling findInsuranceSchem method
		 */
		employeesystem.findInsuranceScheme(employee);

		/*
		 * Calling displayDetails method to display User details
		 */
		employeesystem.displayDetails(employee);

	}

}
