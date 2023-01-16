/**
 * Programmer:			Preetam Kumar Chaurasiya
 * Date:				2023-01-16
 * Filename:			Health.java
 * Assignment: 			Ch 11 Ex 8
 * 
 * Description:			Write an application named UseInsurance that uses
 * an abstract Insurance class and Health and Life subclasses to display
 * different types of insurance policies and the cost per month. The 
 * Insurance class contains a String representing the type of insurance
 * and a double that holds the monthly price. The Insurance class 
 * constructor requires a String argument indicating the type of 
 * insurance, but the Life and Health class constructors require no 
 * arguments. The Insurance class contains a get method for each field;
 * it also contains two abstract methods named setCost() and display().
 * The Life class setCost() method sets the monthly fee to $36, and the 
 * Health class sets the monthly fee to $196. Write an application named
 * UseInsurance that prompts the user for the type of insurance to be 
 * displayed, and then create the appropriate object. Save the files as
 * Life.java, Health.java, Insurance.java, and UseInsurance.java.
*/

import javax.swing.JOptionPane;

public class Health extends Insurance
{
	// nobody likes "magic" numbers ;)
	private final double HEALTH_INSURANCE_COST = 196;

	public Health()
	{
		super("Health");
		setCost();
	}

	public void setCost()
	{
		monthlyCost = HEALTH_INSURANCE_COST;
	}

	public void display()
	{
		JOptionPane.showMessageDialog(null, "Insurance type: " + getInsuranceType() + "\nMonthly Cost: $" + getMonthlyCost());
	}
}
