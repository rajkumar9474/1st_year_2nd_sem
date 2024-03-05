import java.util.Scanner;

class operation
{
	int add(int x, int y)
	{
		return x+y;
	}
}

class Add
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		operation op=new operation();
		int num, ele, sum=0;
		System.out.print("Enter the number of elements you want to add: ");
		num=scan.nextInt();
		System.out.println("Enter the numbers: ");
		for(int i=0; i<num; i++)
		{
			ele=scan.nextInt();
			sum=op.add(sum, ele);
		}
		System.out.println("The Summation result: "+sum);
		
	}
}
