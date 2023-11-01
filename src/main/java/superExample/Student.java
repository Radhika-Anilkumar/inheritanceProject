package superExample;

public class Student extends Person
{
	String course;
	public Student(String name, int age, String course)
	{
		super(name,age);
		this.course=course;
	}
	public void print()
	{
		display();
		System.out.println("Course is "+course);
	}
	public static void main(String args[])
	{
		Student obj=new Student("Radhika", 24, "Java");
		obj.print();
	}
}
