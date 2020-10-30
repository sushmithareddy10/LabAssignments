package demo1;

/*
 * Creating AccountTest to test Account, Person, SavingsAccount, CurrentAccount
 * @Author
 */
import java.util.*;

public class AccountTest {
	public static void main(String[] args) {

		/*
		 * Creating object for Person class for smith
		 */
		Person smith = new Person();
		smith.setName("Smith");

		/*
		 * craeting object for Account class for smith
		 */

		Account accountSmith = new Account(2000, smith);

		/*
		 * Creating object for Person class for Kathey
		 */
		Person kathey = new Person();
		kathey.setName("Kathey");

		/*
		 * craeting object for Account class for kathey
		 */
		Account accountKathey = new Account(3000, kathey);

		/*
		 * 
		 * calling deposit and withdraw using Objects creating for smith and kathey
		 * using Account
		 * 
		 */
		accountSmith.deposit(2000);

		accountKathey.withdraw(3000);

		/*
		 * 
		 * Displaying balances of Smith and Kathey
		 * 
		 */

		System.out.println("The balance in smith account after deposit :" + accountSmith.getBalance());
		System.out.println("The balance in Kathey account after withrawl : " + accountKathey.getBalance());
		/*
		 * Creating SavingsAccount object for Smith
		 */

		SavingsAccount savingsaccount = new SavingsAccount(2000, smith);

		/*
		 * calling withdraw method in svaingsAccount using object
		 */
		savingsaccount.withdraw(3000);

		/*
		 * Creating currentAccount object for kathey
		 */
		CurrentAccount currentaccount = new CurrentAccount(500, 2000, kathey);

		/*
		 * calling withdraw method in currentAccount using object
		 */
		currentaccount.withdraw(2000);

	}
}