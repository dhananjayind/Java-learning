class Employee
{
	int id;
	String name="Raj";
	float salary;
	public void display()
	{
		String name="Raju";
		System.out.println(name);		
		System.out.println(this.name);		
	}
	public void setValue(int id, String name, float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.displayInfo();		
	}
	public void displayInfo()
	{
		System.out.println("Id is "+id+"\tName is "+name+"\tSalary is "+salary);
	}
}
public class ThisKey
{
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.display();
		e.setValue(100,"Ramesh",12000);
		e.displayInfo();
	}
}
