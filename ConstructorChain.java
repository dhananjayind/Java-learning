class Employee
{
	int id;
	String name;
	float salary;
	Employee()
	{
		id=100;
		name="Unknown";
		salary=8000;
	}
	Employee(String name)
	{
		this();
		this.name=name;
	}
	Employee(String name, float salary)
	{
		this();
		this.name=name;
		this.salary=salary;
	}
	public void displayInfo()
	{
		System.out.println("Name is "+name+"\tId is "+id+"\tSalary is "+salary);
	}
}
public class ConstructorChain
{
	public static void main(String args[])
	{
		//Employee e1=new Employee();		
		//e1.displayInfo();
		//Employee e2=new Employee("Raj");
		//e2.displayInfo();
		Employee e3=new Employee("Seeta",12000);
		e3.displayInfo();
	}
}
