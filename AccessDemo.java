import p1.p.A;
public class AccessDemo
{
	public void display()
	{
		A a1=new A();
		//System.out.println(a1.x);
		//System.out.println(a1.z);
		System.out.println(a1.q);
	}
}
class E extends A
{
	public void abc()
	{
		System.out.println(z);
		//System.out.println(x);
		System.out.println(q);
	}
}