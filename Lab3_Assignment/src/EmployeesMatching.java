/**
 * @Author: Sushmitha
 * Date: 24/10/2020
 * Description: To display the count of employees which are matching
 *
 */
import java.util.*;

//Employee class with attribtes name, depatment
class Employee {
	private String name;
	private String department;
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
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	public Employee() {
		
	}
	
	//overriding equals method by downCasting with Employee
	@Override
    public boolean equals(Object o) {
    	Employee e=(Employee) o;
    	boolean result=false;
    	if((o==null) || (this.getClass()!=o.getClass())) {
    		result=false;
    	}
    	else if(e.getName()==null || e.getDepartment()==null) {
    		result=false;
    	}
    	else if((this.getName().equals(e.getName())) && (this.getName().equals(e.getName()))) {
    		result=true;
    	}
    	
    	return result;
    }
}
public class EmployeesMatching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		//Creating three Employee objects and passing name and department as parameters
		Employee e1= new Employee("pankaj","training");
		Employee e2=new Employee("dinesh","hr");
		Employee e3= new Employee("pankaj","trainig");
		Employee e4= new Employee("pankaj","trainig");
		 Employee emp[]= {e1,e2,e3,e4};
		 int sub[]=new int[4];   //creating sub Array for having count of duplicates
		 for(int i=0;i<emp.length;i++) {
			 for(int j=i+1;j<emp.length;j++) {
				 if(emp[i].equals(emp[j])) {
					 sub[j]=1;                   //duplicate value is replaced with 1 at the index of j
				 }
			 }
		 }
		 
		 //counting the number of duplicates
		 for(int i=0;i<sub.length;i++) {
			 if(sub[i]==1) {
				 count++;
			 }
		 }
		 
		 //Displaying the count of duplicates
		 System.out.println("The number similar objects are :"+count);
	}
}

