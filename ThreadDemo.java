class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Run A: "+i);
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		System.out.println("Run B:"+i);
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		A a1=new A();
		B b1=new B();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b1);
		t1.start();
		t2.start();
		System.out.println("This program ends...");
	}
}