import java.io.*;
class A
{
	public void abc() throws IOException, NullPointerException, UserException
	{
		int a=50;
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
			int res=a/(a-i);
			if(i==15)
				throw new NullPointerException();
			if(i==120)
				throw new IOException();
			if(i==100)
				return;
			if(i==70)
				throw new UserException("when i is 7");
			if(i==6)
				throw new UserException("when i is 6");
		}
	}
	public void xyz() throws IOException, NullPointerException, UserException
	{
		abc();
	}
	public void atoz() throws IOException, NullPointerException, UserException
	{
		xyz();
	}
}
public class ExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
			A a1=new A();
			a1.atoz();
		}
		catch(IOException e)
		{
			System.out.println("IO Exception Occured");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception Occured");
		}
		catch(UserException ue)
		{
			System.out.println("User Exception handler.......");
			System.out.println("Reason : "+ue.getMessage());
			ue.printStackTrace();
			ue.demo();
		}
		catch(Exception e)
		{
			System.out.println("Default Exception handler.......");
		}
		finally
		{
			System.out.println("THANK YOU");
		}
		System.out.println("Program Contineus.....");
	}
}

