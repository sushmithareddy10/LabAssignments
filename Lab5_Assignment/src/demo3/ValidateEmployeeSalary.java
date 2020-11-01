/*
 * @Author : Sushmitha
 * Creating Validate Employee class to validate salary and throw Exception
 */
package demo3;

import java.util.*;
import com.cg.eis.exception.EmployeeException;

public class ValidateEmployeeSalary {

	public static void main(String[] args) throws EmployeeException {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * Scanning name form user
		 */
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		/*
		 * Scanning salary from user
		 */
		System.out.println("Enter the salary");
		int salary = sc.nextInt();
		/*
		 * Creating employee object and passing parameters
		 */
		Employee employee = new Employee(name, salary);
		/*
		 * closing scanner
		 */
		sc.close();

	}

}
