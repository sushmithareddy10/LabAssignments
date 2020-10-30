/*
 * Creating Employee class
 * @author: Sushmitha
 *  
 */
package com.cg.eis.bean;

public class Employee {
	/*
	 * Declaring Private variables for Employee class
	 */
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;

	/*
	 * Parameterized Constructor for to assign Instance variables
	 */

	public Employee(int id, String name, double salary, String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public Employee() {

	}

	/*
	 * Getters and Setters for Instance variables
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

}
