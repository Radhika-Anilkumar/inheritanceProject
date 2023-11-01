package singleInheritancePrgm;

public class Person 
{
	String name, place;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPlace(String place)
	{
		this.place=place;
	}
	public void displayDetails()
	{
		System.out.println("Details");
		System.out.println("Name is "+name);//( + "place")
		System.out.println("Place is "+place);
	}
}
