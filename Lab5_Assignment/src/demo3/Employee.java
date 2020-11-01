/*
 * @Author  : Sushmitha
 * creating Employee class
 */
package demo3;

import com.cg.eis.exception.EmployeeException;

public class Employee {
	/*
	 * Creating Instance Variable for employee class
	 */
	private String name;
	private int salary;

	/*
	 * Setters and Getters for Instance Variables
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*
	 * parameterized constructor
	 * 
	 * @param name
	 * 
	 * @param salary
	 */
	public Employee(String name, int salary) throws EmployeeException {
		super();
		this.name = name;
		/*
		 * checking if salary is less tha 30000 and throwing exception
		 */
		try {
			if (salary < 30000) {
				throw new EmployeeException("Your salary is below 30000");
			} else {
				this.salary = salary;
			}
		} catch (EmployeeException e) {
			System.out.println("The exception is :" + e.getMessage());
		}
	}

}
