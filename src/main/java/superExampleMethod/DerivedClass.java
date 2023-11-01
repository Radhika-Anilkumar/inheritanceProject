package superExampleMethod;

public class DerivedClass extends BaseClass
{
	public void displayMethod()
	{
		System.out.println("This is child class method");
	}
	public void showMethod()
	{
		displayMethod();
		super.displayMethod();
	}
	public static void main(String[] args) 
	{
		DerivedClass obj=new DerivedClass();
		obj.showMethod();
	}

}
