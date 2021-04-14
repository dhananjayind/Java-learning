class Calculator
{
	public void add(int... a)
	{
		int res=0;
		for(int x: a)
		{
			res=res+x;
		}
	System.out.println("Addition Result : "+res);
	}
	public void demo(float b, String s, int... a)
	{
	}
}
public class AdvFeatures2
{
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
		c1.add(12,20);
		c1.add(12,34,56,4);
		c1.add(34,3454,556,57,6,34,45);
		c1.add();
	}
}