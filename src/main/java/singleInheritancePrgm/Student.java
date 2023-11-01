package singleInheritancePrgm;

public class Student extends Person
{
	String course;
	public void setCourse(String course)
	{
		this.course=course;
	}
	public String getCourse()
	{
		return course;
	}
	public void printStudentDetails()
	{
		displayDetails();
		System.out.println("Course is "+getCourse());
		
	}
	
}
