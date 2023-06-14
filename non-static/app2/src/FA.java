class F
{
	int i ;
	F(int i)
	{
		i = 10;
		System.out.println("K(int)");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
		
	}
}