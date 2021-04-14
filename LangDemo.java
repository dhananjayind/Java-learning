public class LangDemo
{
	public static void main(String args[])
	{
		String s1="           Hello Everybody ";
		
		System.out.println(s1);
		s1 = s1.trim();
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replace('e','_'));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.lastIndexOf('e'));

		System.out.println("-----------------------------");

		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.sqrt(81));
		System.out.println(Math.cbrt(81));
		System.out.println(Math.min(3,5));

		System.out.println("-----------------------------");

		Integer a = new Integer(10);
		System.out.println(a+5);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toString(a)+5);
		String str = "1050";
		System.out.println(Integer.parseInt(str)+10);
		
	}
}