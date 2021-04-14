public class UserException extends Exception
{
	public UserException()
	{
	}
	public UserException(String str)
	{
		super(str);
	}
	public void demo()
	{
		System.out.println("From User Defined Exception Method");
	}
}