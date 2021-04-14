class OTB implements Runnable
{
	int ticket=1;
	public  void run()
	{
		Thread t =Thread.currentThread();
		String name = t.getName();
		synchronized(this)
		{
			if(ticket>=1)
			{
				System.out.println(name+" Got Ticket");
				ticket--;
			}
			else
			{
				System.out.println("Sorry, "+name+" ticket unavailable ");
			}
		}
	}
}
class TestOTB
{
	public static void main(String args[])
	{
		OTB obj=new OTB();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		
		t1.setName("Sachin");
		t2.setName("Yuvraj");
		t3.setName("Virat");

		t1.start();
		t2.start();
		t3.start();
	}
}