package hierarchicalInheritance;

public class PermanentEmployee extends Employee
{
	int salary;
	public void setPayment(int salary)
	{
		this.salary=salary;
	}
	public int getPayment()
	{
		return salary;
	}
	public void calculateSalary()
	{
		salary=salary+25000;
	}
	
}
