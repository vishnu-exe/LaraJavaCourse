class K
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		System.out.println("mainend");
	}
	static
	{
		System.out.println("SIB");
		main(null);
	}
	
}
