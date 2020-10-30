package demo1;

/*
 * Creating a Person class 
 * @Author : SUSHMITHA
 * 
 */
public class Person {
	/*
	 * declaring variables for Person class
	 */
	private String name;
	private float age;

	public String getName() {
		return name;
	}

	/*
	 * 
	 * Creating setters and getters for variables name, age
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	/*
	 * Parameterized constructor
	 * 
	 * @param name,float
	 */
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	/*
	 * Default Constructor
	 * 
	 */
	public Person() {

	}
}
