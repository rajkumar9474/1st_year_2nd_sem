class parameter
{
	int x;
	double y;
	
	parameter(int x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
	}
}

class pacons
{
	public static void main(String []args)
	{
		parameter test=new parameter(3, 5.6);
		test.display();
	}
}
