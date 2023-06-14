class H
{

	{
		System.out.println("H-IIB 1"); 
	}
	H()
	{
		this(90);
		System.out.println("H()");
	}
	{
		System.out.println("H-IIB 2"); 
	}

	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println("--------");
		H h2 = new H(30);
		System.out.println("--------");
	}
	 H( int i)
	{
		System.out.println("H(int)");
	}
}