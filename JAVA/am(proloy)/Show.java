class variable
{
	int x=20;
	float y=3.25f;
	String z="Strings";
	
	void display()
	{
		System.out.println("X: "+ x);
		System.out.println("Y: "+ y);
		System.out.println(z);
	}
	
}

class Show
{
	public static void main(String args[])
	{
		variable dis=new variable();
		dis.display();
	}
}
