public class DataTypeDemo 
{
	public static void main(String args[])
	{
		int a=100;
		byte b=(byte)a;
		System.out.println(b);

		byte a=100;
		int b=a;
		System.out.println(b);

		float a=3.14F;	
		System.out.println(a);

		double a=3.14;	
		System.out.println(a);

		long a=12345678901L;
		System.out.println(a);

		int a=5;
		if(true)
		{
			System.out.println("hi");
		}
		else
		{
			System.out.println("hello");
		}
		
		int a=5;
		if(false)
		{
			System.out.println("hi");
		}
		else
		{
			System.out.println("hello");
		}

		int a=5,b=10;
		boolean res=a>b;
		if(res)
		{
			System.out.println("hi");
		}
		else
		{
			System.out.println("hello");
		}


		char ch='a';
		ch=99;
		ch='\u0064';
		System.out.println(ch);


		
		
	}
}