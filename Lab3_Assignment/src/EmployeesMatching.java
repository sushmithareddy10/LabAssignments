
/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: To display the count of employees which are matching
 *
 */
import java.util.*;

/*
 * creating Employee class
 */
class Employee {
	/*
	 * declaring instance variables with private access specifier
	 */
	private String name;
	private String department;

	/*
	 * setter and getters for private variables
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	/*
	 * parameterized constructor
	 */
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	/*
	 * default constructor
	 */
	public Employee() {

	}

	/*
	 * overriding equals method by downCasting with Employee
	 */
	@Override
	public boolean equals(Object o) {
		/*
		 * downcasting the paramter object
		 */
		Employee e = (Employee) o;
		boolean result = false;
		/*
		 * checking if object is null or object class and employee class are same
		 */
		if ((o == null) || (this.getClass() != o.getClass())) {
			result = false;
		}
		/*
		 * checking if the variables are null
		 */
		else if (e.getName() == null || e.getDepartment() == null) {
			result = false;
		}
		/*
		 * checking if the values are equal
		 */
		else if ((this.getName().equals(e.getName())) && (this.getName().equals(e.getName()))) {
			result = true;
		}
		/*
		 * returning the result
		 */
		return result;
	}
}

/*
 * creating employeeMatching class
 */
public class EmployeesMatching {

	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		int count = 0;

		/*
		 * Creating three Employee objects and passing name and department as parameters
		 */
		Employee e1 = new Employee("pankaj", "training");
		Employee e2 = new Employee("dinesh", "hr");
		Employee e3 = new Employee("pankaj", "trainig");
		Employee e4 = new Employee("pankaj", "trainig");
		/*
		 * declaring employee array
		 */
		Employee emp[] = { e1, e2, e3, e4 };
		/*
		 * creating sub Array for having count of duplicates
		 */
		int sub[] = new int[4];
		/*
		 * looping through array
		 */
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].equals(emp[j])) {
					/*
					 * uplicate value is replaced with 1 at the index of j
					 */
					sub[j] = 1;
				}
			}
		}

		/*
		 * counting the number of duplicates
		 */
		for (int i = 0; i < sub.length; i++) {
			if (sub[i] == 1) {
				count++;
			}
		}

		/*
		 * Displaying the count of duplicates
		 */
		System.out.println("The number similar objects are :" + count);
		/*
		 * closing the scanner
		 */
		sc.close();
	}
}
