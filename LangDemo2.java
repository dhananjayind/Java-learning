class Abc implements Cloneable
{
	int x;
	public String toString()
	{
		return "The object with the value of x : "+x;
	}
	public Abc clone()
	{
		try
		{
			return (Abc)super.clone();
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
		return null;
	}
	public void finalize()
	{
		System.out.println("object with value  "+x+" getting removed......");
	}
}
public class LangDemo2
{
	public static void main(String args[]) throws Exception
	{
		String s1 =  new  String("Hello Everybody");
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("Hello");
		s2.append("How are you? ");
		System.out.println(s2);
		System.out.println("--------------------------------");

		Abc a1 = new Abc();
		Abc a2 = new Abc();
		a1.x = 10;
		a2.x = 50;
		System.out.println(a1.equals(a2));
		
		Abc a3 = a1.clone();

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	
		Class c1 = a2.getClass();
		Class c2 = "Demo".getClass();
		System.out.println("a2 is the object of class : "+c1.getName());
		System.out.println("Demo is the object of class : "+c2.getName());

		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());

		a3.x = 100;

		a1 = null;
		a3 = null;

		System.gc();
		Thread.sleep(1000);
		System.out.println(a3);
		System.out.println("--------------------------------");

		System.out.println("Wait for 5 sec .....");

		Runtime rt = Runtime.getRuntime();

		Thread.sleep(5000);
		Process p1 = rt.exec("calc.exe");
		Thread.sleep(5000);
		Process p2 = rt.exec("mspaint.exe");
		Thread.sleep(5000);
		Process p3 = rt.exec("notepad.exe");

		Thread.sleep(10000);
		p3.destroy();
		Thread.sleep(5000);
		p2.destroy();
		Thread.sleep(5000);
		p1.destroy();
		
	}
}