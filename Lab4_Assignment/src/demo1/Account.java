package demo1;

/**
 * Creating Account class
 * @author SUSHMITHA
 *
 * */
import java.util.*;

public class Account {
	/*
	 * 
	 * Creating variable for Account class
	 * 
	 */
	private static int count = 0;
	private long accNum = 1;
	private double balance;
	private Person accHolder;

	/*
	 * 
	 * Setter and Getters for Account variables
	 *
	 */
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public Account(double balance, Person accHolder) {
		this.balance = balance;
		this.accHolder = accHolder;
		Account.count += 1;
		this.accNum = Account.count;
	}

	public Account() {

	}

	/*
	 * 
	 * creating deposit method to add amount to balance
	 * 
	 * @param amount
	 */
	public void deposit(double amount) {
		balance = balance + amount;

	}

	/*
	 * 
	 * Creating withdraw method to deduct amount from balance
	 * 
	 * @param amount
	 */
	public void withdraw(double amount) {
		balance = balance - amount;

	}
}
