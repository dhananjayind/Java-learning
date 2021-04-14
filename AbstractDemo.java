abstract class A
{
	//abstract int x;
	A()
	{
		System.out.println("A()");
	}
	public void abc()
	{
	}

	public abstract void xyz();
}
abstract class B extends A
{
	B()
	{
		System.out.println("B()");
	}
}
class C extends B
{
	public void xyz()
	{
	}
}
public class AbstractDemo
{
	public static void main(String args[])
	{
		//A a1=new A();
		C c1=new C();
	}
	
}