public class SetGet
{
	private int id;
	private String name;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public int getId()
	{
		System.out.println("ID : "+id);
		return id;
	}
	public String getName()
	{
		System.out.println("NAME : "+name);
		return name;
	}
}
class Abc
{
	public static void main(String args[])
	{
		SetGet ob = new SetGet();
		ob.setId(100);
		ob.setName("RAJ");
		ob.getId();
		ob.getName();
	}
}