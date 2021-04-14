class Employee
{
	String name;
	int age;
	double salary;
	String designation;
	Employee(String nme, int ag, double sal, String deg)
	{
		name=nme;
		age=ag;
		salary=sal;
		designation=deg;
	}
	public void display()
	{
		System.out.println("NAME: " +name+ "\tAGE: " +age+ " \tSALARY: " +salary+ " \tDESIGNATION: " +designation);
	}
	public void raiseSalary(int amt)
	{
		salary=amt+salary;
	}
}
public class MainEmployee
{
	public static void main(String args[])
	{
		Employee e1 = new Employee("RAJ",20,10000.50,"CLERK");
		Employee e2 = new Employee("RAHUL",30,30000.80,"ENGINEER");
		Employee e3 = new Employee("SHYAM",45,50000.90,"MANAGER");
		System.out.println("---------------");
		System.out.println("Details of the Employee before raise in their salary");
		System.out.println("---------------");
		System.out.println("\nEmployee 1:");
		e1.display();
		System.out.println("\nEmployee 2:");
		e2.display();
		System.out.println("\nEmployee 3:");
		e3.display();
		e1.raiseSalary(2000);
		e2.raiseSalary(4000);
		e3.raiseSalary(5000);
		System.out.println("\n---------------");
		System.out.println("Details of the Employee after raise in their salary");
		System.out.println("---------------");
		System.out.println("\nEmployee 1:");
		e1.display();
		System.out.println("\nEmployee 2:");
		e2.display();
		System.out.println("\nEmployee 3:");
		e3.display();
	}
}