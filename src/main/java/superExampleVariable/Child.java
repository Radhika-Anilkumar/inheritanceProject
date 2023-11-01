package superExampleVariable;

public class Child extends Parent
{
	int a=50;
	public void printVariable()
	{
		System.out.println("Calling variable 'a' is "+super.a);
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.printVariable();

	}

}
