import java.util.Scanner;

public class MarksObtained
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);

		String name;
		int c;
		float percentage;

		System.out.println("Enter the name of the student ");
		name = sc.nextLine();
		System.out.println("Enter the class of the student");
		c = sc.nextInt();
		System.out.println("Enter the marks obtained in SCIENCE");
		float science = sc.nextFloat();
		if(science>100)
		{
			System.out.println("Please re-enter the marks in the range of 0-100");
			science = sc.nextFloat();
		}
		System.out.println("Enter the marks obtained in SOCIAL");
		float social = sc.nextFloat();
		if(social>100)
		{
			System.out.println("Please re-enter the marks in the range of 0-100");
			science = sc.nextFloat();
		}
		System.out.println("Enter the marks obtained in MATHS");
		float maths = sc.nextFloat();
		if(maths>100)
		{
			System.out.println("Please re-enter the marks in the range of 0-100");
			science = sc.nextFloat();
		}
		System.out.println("Enter the marks obtained in ENGLISH");
		float english = sc.nextFloat();
		if(english>100)
		{
			System.out.println("Please re-enter the marks in the range of 0-100");
			science = sc.nextFloat();
		}
		System.out.println("Enter the marks obtained in HINDI");
		float hindi = sc.nextFloat();
		if(hindi>100)
		{
			System.out.println("Please re-enter the marks in the range of 0-100");
			science = sc.nextFloat();
		}

		float tot = (science+social+maths+english+hindi);
		percentage = (tot/5);
		if(percentage < 100)
		{
			System.out.println("\nName : "+name);
			System.out.println("\nClass : "+c);
			System.out.println("\nScience : "+science);
			System.out.println("Social : "+social);
			System.out.println("Maths : "+maths);
			System.out.println("English : "+english);
			System.out.println("Hindi : "+hindi);
			System.out.println("\nPercentage is :"+percentage+"%");
			if((science<40)||(social<40)||(maths<40)||(english<40)||(hindi<40))
				System.out.println("RESULT : FAIL");
					
			else if(percentage>=70)
				System.out.println("\nResult : DISTINCTION");
			else if((percentage>=60)&&(percentage<70))
				System.out.println("\nResult : FIRST CLASS");
			else if((percentage>=50)&&(percentage<60))
				System.out.println("\nResult : SECOND CLASS");
			else if((percentage>=40)&&(percentage<50))
				System.out.println("\nResult : THIRD CLASS");
			else if(percentage<40)
				System.out.println("\nResult : FAIL");
		}
		else
		{
			System.out.println("The information given to us is inappropiate");
		}
	}
}	