public class WeekDays
{
	public static void main(String args[])
	{
		System.out.println("Enter any no b/w 1-7 to see the res day");
		int ch = 6;
		switch(ch)
		{
			case 1:
			{
				System.out.println("Monday");
			}
			break;
			case 2:
			{
				System.out.println("Tuesday");
			}
			break;
			case 3:
			{
				System.out.println("Wed");
			}
			break;
			case 4:
			{
				System.out.println("Thr");
			}
			break;
			case 5:
			{
				System.out.println("Fri");
			}
			break;
			case 6:
			{
				System.out.println("Sat");
			}
			break;
			case 7:
			{
				System.out.println("Sun");
			}
			break;
			default:
			{
				System.out.println("Invalid choice");
			}
		}
	}
}