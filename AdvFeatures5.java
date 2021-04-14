import java.util.Scanner;
public class AdvFeatures5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice ");
		//char ch = 'b';
		String ch = sc.next();
		switch(ch)
		{
			case "yes" : System.out.println("HI");
				break;
			case "no" : System.out.println("HELLO");
				break;
			case "unknown" : System.out.println("How R U?");
				break;
			default : System.out.println("THANKS");
				break;
		}
	}
}