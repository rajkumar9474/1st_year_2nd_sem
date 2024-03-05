import java.util.Scanner;

class search
{
	Scanner sc=new Scanner(System.in);
	int lt[], n;
	
	void arr()
	{
		int ele;
		System.out.print("Enter the number of elements in the list: ");
		n=sc.nextInt();
		lt=new int [n];
		for(int i=0; i<n; i++)
		{
			ele=sc.nextInt();
			lt[i]=ele;
		}
	}
	
	void linear()
	{
		int find, fl=0;
		System.out.print("Enter the element you want to find: ");
		find=sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			if(find==lt[i])
			{
				System.out.println("Found in position: "+(i+1));
				fl=1;
			}
		}
		
		if (fl==0)
		System.out.println("Not Found");
	}
}

class Linear
{
	public static void main(String args[])
	{
		search sr=new search();
		sr.arr();
		sr.linear();
	}
}
