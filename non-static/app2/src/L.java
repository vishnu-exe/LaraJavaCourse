class L
{
	L(int i, int j)
	{
		System.out.println("L(int,int)");
	}
	L(int i ,double j )
	{
		System.out.println("L(int,double)");
	}

	public static void main(String[] args) 
	{
		L l1 = new L(90,20);
		System.out.println("-------");
		L l2 = new L(10,20.0);
		System.out.println("-------");
		
	}
}