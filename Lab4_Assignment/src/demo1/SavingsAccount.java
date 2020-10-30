
/*
 * 
 * Creating SavingsAccount which extends Account class
 * 
 */
package demo1;

public class SavingsAccount extends Account {
	/*
	 * Creating variable with modifier final
	 */
	private final double MINIMUM_BALANCE = 500;

	/*
	 * 
	 * Parameterized constructor
	 * 
	 */
	public SavingsAccount(double balance, Person smith) {
		super(balance, smith);
	}

	/*
	 * 
	 * Creating withdraw method from Smith account
	 * 
	 */
	@Override
	public void withdraw(double amount) {
		/*
		 * check if balance is less than minimum balance or not
		 */
		if ((getBalance() - amount) > amount) {
			double balance = getBalance() - amount;
			System.out.println("The balance after withdraw is :" + balance); // Displaying if condition is true
		} else {
			System.out.println("Minimum balance should be maintained"); // Displaying if condition is false
		}

	}

}
