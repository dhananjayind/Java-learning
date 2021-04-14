import java.util.Scanner;
class Employee
{
	String name;
	int age;
	int salary;
	String designation;
	Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter age");
		age=sc.nextInt();
	}
	public void display()
	{
		System.out.println("------------------------------------------------");
		System.out.println("\nNAME: " +name+ "\nAGE: " +age+ " \nSALARY: " +salary+ " \nDESIGNATION: " +designation+"\n");
	}
	public void raiseSalary()
	{
		salary=salary+2000;
	}	
}
class Clerk extends Employee
{
	public Clerk()
	{
		salary=8000;
		designation="Clerk";
	}	
	public void raiseSalary()
	{
		salary=salary+5000;
	}	
	
}

class Programmer extends Employee
{
	public Programmer()
	{
		salary=20000;
		designation="Programmer";
	}
	public void raiseSalary()
	{
		salary=salary+10000;
	}
}

class Manager extends Employee
{
	public Manager()
	{
		salary=70000;
		designation="Manager";
	}
	public void raiseSalary()
	{
		salary=salary+20000;
	}
	
}

public class EmployeeManagement
{
	public static void main(String args[])
	{
		Clerk c1=new Clerk();
		Programmer p1=new Programmer();
		Manager m1=new Manager();
		c1.display();
		p1.display();
		m1.display();
		System.out.println("------------------------After raising Salary------------------------");
		c1.raiseSalary();
		p1.raiseSalary();
		m1.raiseSalary();
		c1.display();
		p1.display();
		m1.display();
	}
}