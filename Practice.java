import java.util.Scanner;
class Employee
{ 
	int age;
	String name;
	float salary;
	String desig;
	
	Scanner sc=new Scanner(System.in);
	Employee()
	{
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the age");
		age=sc.nextInt();
		System.out.println("Enter the salary");
		salary=sc.nextFloat();
		System.out.println("Enter the Designation");
		desig=sc.nextLine();
		System.out.println("\n");
	}
	void display()
	{
		System.out.println("\nName : "+name+"\nAge : "+age+"\nSalary : "+salary+"\nDesignation : "+desig);
	}
	void raiseSalary()
	{
		float amt;
		System.out.println("Enter the amount by which salary has to be increased of "+name+" : ");
		amt = sc.nextFloat();
		salary = salary + amt;
	}
}
public class Practice
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		e1.display();
		e2.display();
		e3.display();
		System.out.println("-------------------------------------------");
		System.out.println("----AFTER RAISING SALARY-----");

		e1.raiseSalary();
		e2.raiseSalary();
		e3.raiseSalary();

		e1.display();
		e2.display();
		e3.display();
	}
}