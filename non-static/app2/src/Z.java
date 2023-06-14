class Z
{

    static
	{
		System.out.println("SIB Begin");
		Z z1 = new Z();
		System.out.println("SIB End");
	}
	Z()
	{
		System.out.println("Z()");
	}
		public static void main(String[] args) 
	{
	    System.out.println("-------");
		Z z1 = new Z();
		System.out.println("-------");
		
	}
}