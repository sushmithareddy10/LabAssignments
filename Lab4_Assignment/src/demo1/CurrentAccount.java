/*
 * Creating currentAccount class which extends Account class
 */
package demo1;

public class CurrentAccount extends Account {
	/*
	 * creating a variable for draftLimit
	 */
	private double draftLimit;

	/*
	 * Parameterized constructor
	 */
	public CurrentAccount(double draftLimit, double balance, Person kathey) {
		/*
		 * calling super class for initializing balance and kathey
		 */
		super(balance, kathey);
		this.draftLimit = draftLimit;
	}

	/*
	 * creating method for withdrawing amount
	 * 
	 * @param amount
	 */
	public void withdraw(double amount) {
		/*
		 * Adding the draftLimit with amount and balance
		 */
		double balance = getBalance() + amount + draftLimit;
		System.out.println("The amount withdrawn is :" + balance);

	}

}
