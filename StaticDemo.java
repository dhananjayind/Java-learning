class Abc
{
	static int x;
	static int y=150;
	static int z=200;
	public static void xyz()
	{
		System.out.println("From xyz() method");
		System.out.println(y);
		demo();
		//System.out.pritnln(this.z);
	}
	public static void demo()
	{
		System.out.println("Just for demo");
	}
	public static void someMetthod()
	{
		System.out.println("From someMethod()......");
	}
}
class Xyz extends Abc
{
	public static void demo()
	{
		//super.demo();
	}
}
public class StaticDemo
{
	public static void main(String args[])
	{
		Abc a1=new Abc();
		Abc a2=new Abc();
		Abc a3= new Abc();
		
		a1.x=10;
		a2.x=20;
		a3.x=30;
		a2.x=100;
		Abc.xyz();
	}
	static
	{
		System.out.println("From Static block....");
	}
	
}