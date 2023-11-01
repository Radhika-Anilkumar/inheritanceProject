package multiLevelInheritancePrgm;

public class Employee extends Person
{
	//intermidate class
	int employeeId;
	public void setLd(int employeeId)
	{
		this.employeeId=employeeId;
	}
	public int getEmployeeId()
	{
		return employeeId;
	}
}
