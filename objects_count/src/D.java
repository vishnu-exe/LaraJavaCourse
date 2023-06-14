class D 
{
	static int count;
	D ()
	{
		count++;
	}


	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("a; " + count);
		D d2 = new D();
		System.out.println("b; " + count);
		D d3 = new D();
		System.out.println("c; " + count);
		D d4 = new D();
		System.out.println("d; " + count);
		D d5 = new D();
		System.out.println("e; " + count);

		System.out.println("f; " + d1.count);
		System.out.println("g; " + d2.count);
		System.out.println("h; " + d3.count);
		System.out.println("i; " + d4.count);
		System.out.println("j; " + d5.count);
		
	}
}
