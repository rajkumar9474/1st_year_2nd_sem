import java.util.Scanner;

class sturec
{
	public static void main(String args[])
	{
		int roll, marks;
		String name, sub, add;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name: ");
		name= sc.nextLine();
		System.out.print("Enter Roll: ");
		roll= sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Subject: ");
		sub= sc.nextLine();
		System.out.print("Enter marks: ");
		marks= sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Address: ");
		add= sc.nextLine();
		System.out.println();
		
		System.out.println("The Name of Student: "+name);
		System.out.println("The Roll of Student: "+roll);
		System.out.println("The Subject of Student: "+sub);
		System.out.println("The Marks of Student: "+marks);
		System.out.println("The Address of Student: "+add);
	}
}
