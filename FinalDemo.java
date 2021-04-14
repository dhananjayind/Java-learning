class A
{
	final int x=10;
	public final void abc()
	{
		System.out.println("HI");
	}
}
final class B extends A
{
	/*public void abc()
	{
		System.out.println("Hello");
	}*/
}
class C //extends B
{
}
public class FinalDemo
{
	public static void main(String args[])
	{
		A a1=new A();
		//a1.x=50;
		System.out.println(a1.x);
	}
}