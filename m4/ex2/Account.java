/**
 * Programmer:			Preetam Kumar Chaurasiya
 * Date:				2023-01-15
 * Filename:			Account.java
 * Assignment: 			Ch 11 Ex 2
 * 
 * Description:		A) Create an abstract class named "Account" for a bank.
 * Include an integer field for the account number and a double field 
 * for the account balance. Also include a constructor that requires an 
 * account number and that sets the balance to 0.0. Include a set method
 * for the balance. Also include two abstract get methods -- one for 
 * each field. Create two child classes of Account: Checking and Savings.
 * Within the Checking class, the get method displays the String 
 * "Checking Account Information", the account number, and the balance. 
 * Within the Savings class, add a field to hold the interest rate, and 
 * require the Savings constructor to accept an argument for the value 
 * of the interest rate. The Savings get method displays the String 
 * "Savings Account Information", the account number, the balance, and 
 * the interest rate. Write an application that demonstrates you can 
 * instantiate and display both Checking and Savings objects. Save the 
 * files as Account.java, Checking.java, Savings.java, and 
 * DemoAccounts.java
 * 
 * B) Write an application name AccountArray in which you enter data for
 * a mix of 10 Checking and Savings accounts. Use a for loop to display 
 * the data. Save the file as AccountArray.java
*/

public abstract class Account
{
	protected int accountNumber;
	protected double balance;
	
	public Account(int acctNum)
	{
		accountNumber = acctNum;
		setBalance(0.0);
	}
	
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public abstract int getAccountNumber();
	public abstract double getBalance();
	
	// Added this because it makes sense with my current application design
	public abstract String getAccountInfo();
}
