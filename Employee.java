import java.util.Scanner;

class Emp
{
	int age;
	String name;
	float sal;
	String desig;
	Emp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.nextLine();
		System.out.println("Enter your age :");
		age=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name : "+name+"\tAge : "+age+"\tSalary :"+sal+"\tDesignation :"+desig);
	}
	public void raiseSal()
	{
		sal=sal+2000;
	}
}
class Clerk extends Emp
{
	Clerk()
	{
		sal=8000;
		desig="Clerk";
	}
	public void raiseSal()
	{
		sal=sal+5000;
	}
}
class Programmer extends Emp
{
	Programmer()
	{
		sal=20000;
		desig="Programmer";
	}
	public void raiseSal()
	{
		sal=sal+10000;
	}
}
class Manager extends Emp
{
	Manager()
	{
		sal=70000;
		desig="Manager";
	}
	public void raiseSal()
	{
		sal=sal+20000;
	}
}
public class Employee
{
	public static void main(String args[])
	{
		Clerk c1 = new Clerk();
		Programmer p1 = new Programmer();
		Manager m1 = new Manager();
		c1.display();
		p1.display();
		m1.display();

		c1.raiseSal();
		p1.raiseSal();
		m1.raiseSal();

		System.out.println("After increment");

		c1.display();
		p1.display();
		m1.display();
	}
}