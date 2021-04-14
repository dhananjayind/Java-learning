class A
{
 	protected void abcd()
	{
		System.out.println("Hi");
	}
}
class B extends A
{
	void abc()
	{
		System.out.println("Hello");
	}
}
class C extends B
{
	public void ab()
	{
		System.out.println("Thanks");
	}
}
public class InheritanceDemo
{
	public static void main(String args[])
	{
		C c1 = new C();
		c1.abcd();
		
	}
}