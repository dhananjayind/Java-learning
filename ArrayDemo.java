public class ArrayDemo
{
	public static void main(String[] args)
	{
		int c[];
		int[] a=new int[5];	
		int b[] = new int [5];	
		//int b[5];			
		//int b[] = new int[];		
		//int b[5] = new int [];


		int arr[]={11,22,33,44,55,66,77,88};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("-------------------------");	
		for(int x:arr) 				
		{
			System.out.println(x);
		}
		System.out.println("-------------------------");	
		for(int i=0;i<args.length;i++) 			
		{
			System.out.println(args[i]); 
		}
		System.out.println("-------------------------");
		int arr2[][]=new int[5][4];
		arr2[0]=new int[3];
		arr2[1]=new int[8];
		arr2[2]=new int[2];
		arr2[3]=new int[5];
		arr2[4]=new int[1];
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]);	//or (arr[i][j])
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		Emp e[]=new Emp[5];
		String str[]={"Tarun","Arun","Aniemsh","Anklesh","Pratibha"};
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Emp();
			e[i].name=str[i];
		}
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].name);
		}
		for(Emp e1:e)
		{
			System.out.println("\nName : "+e1.name);
		}
	}
}
class Emp
{
	String name;
}
		