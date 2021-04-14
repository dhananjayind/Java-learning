class A
{
	A()
	{	
		
		System.out.println("A()");
		
	}
	void abc()
	{
		System.out.println("abc");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
}
public class Ayush
{
	public static void main(String args[])
	{
		B b1 = new B();
		b1.abc();
	}
}
