class C 
{
	static int count;
	C ()
	{
		count++;
	}


	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("a; " + count);
		C c2 = new C();
		System.out.println("b; " + count);
		C c3 = new C();
		System.out.println("c; " + count);
		C c4 = new C();
		System.out.println("d; " + count);
		C c5 = new C();
		System.out.println("e; " + count);
		
	}
}
