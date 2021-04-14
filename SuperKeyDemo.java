class A
{
	int x = 10;
	A()
	{
		System.out.println("A()");
	}
	A(int x)
	{
		System.out.println("A(int)");
	}
	A(String s)
	{
		System.out.println("A(String)");
	}
	public void abc()
	{
		System.out.println("HI");
	}
}
class B extends A
{
	int x = 50;
	B()
	{
		System.out.println("B()");
	}
	B(int x)
	{
		super(x);
		System.out.println("B(int)");
	}
	B(String s)
	{
		super(s);
		System.out.println("B(String)");
	}
	public void abc()
	{
		System.out.println("HELLO");
	}
	public void xyz()
	{
		System.out.println(super.x);
		System.out.println(x);
		super.abc();
		this.abc();
	}
}
public class SuperKeyDemo
{
	public static void main(String args[])
	{
		B b1=new B("10");
		//b1.abc();
		b1.xyz();
	}
}