class Room
{
	int length;
	int width;
	int area;
	public void area()
	{
		length=40;
		width=10;
		area=length*width;
	}
	public void display()
	{
		System.out.println("Area :"+area);
	}
}
public class Demo
{
	public static void main(String ag[])
	{
		Room r1=new Room();
		r1.area();
		r1.display();
	}
}