class Bike implements Runnable
{
	public void run()
	{
		Thread t = Thread.currentThread();
		String n = t.getName();
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(n+" completes "+i+" lap ");
		}
	}
}
class ThreadBikeDemo
{
	public static void main(String args[])throws Exception
	{
		Bike b = new Bike();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		t1.setName("	DUKE");
		t2.setName("YAHAMA");
		System.out.println("Game starts now.....");
		Thread.sleep(5000);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		Thread t = Thread.currentThread();
		System.out.println("Game ends now........");
	}
}