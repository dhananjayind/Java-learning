 enum Gender
{
	MALE,FEMALE;
}
enum Currency
{
	INR, JPY, USD;
}
class Emp
{
	String name;
	int age;
	int salary;
	Currency currency;
	Gender gender;
}
public class AdvFeatures
{
	public static void main(String args[])
	{
		Emp e1=new Emp();
		e1.name="Rajesh";
		e1.age=25;
		e1.salary=10000;
		e1.currency=Currency.USD;
		e1.gender=Gender.FEMALE;
	}
}
