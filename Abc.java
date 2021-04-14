class X
{
	public static void main(String args[])
	{
		System.out.println("From X");
		Y.main(args);
		Z.main(args);
	}
}
class Y
{
	public static void main(String args[])
	{
		System.out.println("From Y");
	}

}
class Z
{
	public static void main(String args[])
	{
		System.out.println("From Z");
	}
}