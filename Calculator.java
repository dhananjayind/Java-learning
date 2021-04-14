class Calc
{
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}

	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}

	public void div(int a, int b)
	{
		System.out.println(a/b);
	}

}
public class Calculator
{
	public static void main(String args[])
	{
		Calc c = new Calc();
		c.add(10,20);
		c.sub(50,30);
		c.mul(10,10);
		c.div(20,4);
	}
}