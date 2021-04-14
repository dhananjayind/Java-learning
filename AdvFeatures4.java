import java.util.*;
import java.sql.*;
import java.io.*;
public class AdvFeatures4
{
	public static void main(String args[])
	{
		try
		{
			int a=50;
			for(int i=1;i<=50;i++)
			{
				System.out.println(i);
				int res=a/(a-i);
				if(i==180)
					throw new NullPointerException();
				if(i==150)
					throw new IndexOutOfBoundsException();
				if(i==120)
					throw new IOException();
				if(i==100)
					throw new SQLException();
				if(i==70)
					throw new InputMismatchException();
			}
		}
		catch(ArithmeticException | NullPointerException | IndexOutOfBoundsException e)
		{
			System.out.println("Exception Occured.....");
		}
		catch(IOException | SQLException e)
		{
			System.out.println("Critical Exception Occured....");
		}
		catch(Exception e)
		{
			System.out.println("Default Exception Occured.....");
		}
		System.out.println("Program Continues....");
	}
}