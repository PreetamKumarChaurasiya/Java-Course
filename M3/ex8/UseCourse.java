/**
	Programmer:			Preetam Kumar Chaurasiya
	Date:				2023-01-14
	Filename:			UseCourse.java
	Assignment: 		Ch 10 Ex 8

	Description:		Create a class named "CollegeCourse" that includes data 
	fields that hold the department (for example, ENG), the course number (for
	example, 101), the credits (for example, 3), and the fee for the course (for
	example, $360). All of the fields are required as arguments to the 
	constructor, except for the fee, which is calculated at $120 per credit 
	hour. Include a display() method that displays the course data. Create a 
	subclass named "LabCourse" that adds $50 to the course fee. Override the 
	parent class display() method to indicatie that the course is a lab course 
	and to display all the data. Write an application named "UseCourse" that 
	prompts the user for course information. If the user enters a class in any 
	of the following departments, create a "LabCourse: BIO, CHM, CIS, or PHY." 
	If the user enters any other department, create a "CollegeCourse" that does 
	not	include a lab fee. Then display the course data. Save the files as
	"CollegeCourse.java", "LabCourse.java", and "UseCourse.java."
*/

import java.util.Scanner;

public class UseCourse
{
	private enum labCourses {BIO, CHM, CIS, PHY};
	
	private static boolean isLabCourse(String d)
	{
		for(labCourses c : labCourses.values())
		{
			if(c.name().equals(d))
				return true;
		}
		
