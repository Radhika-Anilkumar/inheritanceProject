package hierarchicalInheritance;

public class ContractEmployee extends Employee
{
	int salary;
	String payrollcompany;
	public void setPay(int salary)
	{
		this.salary=salary;
	}
	public void setPayRoll(String payrollcompany)
	{
		this.payrollcompany=payrollcompany;
	}
	public int getPay()
	{
		return salary;
	}
	public String getPayRoll()
	{
		return payrollcompany;
	}
	public void calculateSalary()
	{
		salary=salary+10000;
	}
	public void display()
	{
		calculateSalary();
		System.out.println("Salary is "+getPay());
		System.out.println("Payroll is "+getPayRoll());
	}
	
}
