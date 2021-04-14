class A
{
	public void displayA()
	{
		System.out.println("From A");
	}
}
class B extends A
{
	public void displayB()
	{
		System.out.println("From B");
	}
}
class C extends B
{
	public void displayC()
	{
		System.out.println("From C");
	}
}
public class InheritanceDemo1
{
	public static void main(String args[])
	{
		C c1 = new C();
		c1.displayA();
		c1.displayB();
		c1.displayC();
	}
}