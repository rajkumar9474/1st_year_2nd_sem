import java.util.Scanner;

class binser
{
	public static void main(String args[])
	{
		search se=new search();
		se.arr();
		se.binary();
	}
}

class search
{
	int len, list[], low, high ,mid, find;
	Scanner sc=new Scanner(System.in);
	
	void arr()
	{
		System.out.print("Enter the Length of the sorted list: ");
		len=sc.nextInt();
		list=new int[len];
		System.out.print("Enter Elements: \n");
		for(int i=0; i<len; i++)
		{
			list[i]=sc.nextInt();
		}
	}
	
	void binary()
	{
		System.out.print("Enter the element you want to find: ");
		find=sc.nextInt();
        low = 0;
        high = len-1;
        boolean isFound = false;
		
		
		while(low <= high)
		{
			mid=(int)(low+high)/2;
			
			if (list[mid]>find)
			{
				high=mid-1;
			}
			else if (list[mid]<find)
			{
				low=mid+1;
			}
			else if (list[mid]==find)
			{   
                isFound = true;
				System.out.println("Found at position "+(mid+1));
				break;
			}
		}
		
		if (!isFound) 
		{
        		System.out.println("Element not found");
        	}
	}
}

