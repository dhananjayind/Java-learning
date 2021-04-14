class Employee
{
	private int id;
	private String name;
	private float salary;
	public void setValue(int id, String name, float salary)
	{
		this.id=id;
		this.name=name;
		if(salary<8000)
		{
			this.salary=8000;
		}
		else
		{
			this.salary=salary;
		}
	}
	public void displayInfo()
	{
		System.out.println("Name is " +name+ "\tId is " +id+ "\tSalary is " +salary);
	}
}
public class EncapsulationDemo
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setValue(100,"Raj",-12000);
		e1.displayInfo();
	}
}
