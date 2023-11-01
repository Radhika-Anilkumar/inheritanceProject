package multiLevelInheritancePrgm;

public class Tester extends Employee
{
	String specification;
	public void setSpecification(String specification)
	{
		this.specification=specification;
	}
	public void printEmployeeDetails()
	{
		displayPersonDetails();
		System.out.println("Employee id is "+getEmployeeId());
		System.out.println("Specification is "+specification);
	}
	
}
