public class MarksCard
{
	public static void main(String args[])
	{
		int m=65;
		if(m>=75)
			System.out.println("Destinction");
		else if(m<75 && m>=60)
			System.out.println("1st CLASS");
		else if(m<60 && m>=50)
			System.out.println("2nd Class");
		else if(m<50 && m>=40)
			System.out.println("3rd Class");
		else
			System.out.println("FAIL");
	}
}