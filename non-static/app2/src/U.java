class U
{
	U()
	{
		this(10);
		System.out.println("U()");
	}
	U(int i)
	{
		this();
		System.out.println("T(int)");
	}
		public static void main(String[] args) 
	{
		U u1 = new U();
		System.out.println("-------");
		U u2 = new U(10);
		System.out.println("-------");
		
	}
}