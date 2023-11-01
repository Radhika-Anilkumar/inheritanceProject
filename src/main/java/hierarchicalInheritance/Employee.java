package hierarchicalInheritance;

public class Employee 
{
	String name;
	int empiId;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEmployeeId(int empiId)
	{
		this.empiId=empiId;
	}
	public String getName()
	{
		return name;
	}
	public int getEmpiId()
	{
		return empiId;
	}
	public static void main(String[] args) 
	{
		PermanentEmployee pe=new PermanentEmployee();
		pe.setName("Radhika");
		pe.setEmployeeId(234);
		System.out.println("Name is "+pe.getName());
		System.out.println("ID is "+pe.getEmpiId());
		pe.setPayment(23456);
		pe.calculateSalary();
		System.out.println("Salary for permanent is "+pe.getPayment());
		
		ContractEmployee co=new ContractEmployee();
		co.setName("Akhila");
		co.setEmployeeId(567);
		co.setPay(234);
		co.setPayRoll("ert");
		System.out.println("Name is "+co.getName());
		System.out.println("ID is "+co.getEmpiId());
		co.display();
	}
}

