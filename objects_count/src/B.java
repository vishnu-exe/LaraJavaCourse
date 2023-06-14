class B 
{
	static int p = 10;;


	public static void main(String[] args) 
	{
		System.out.println("a; " + p);
		System.out.println("b; " + B.p);
		B b1 = new B();
		System.out.println("c; " + b1.p);
	}
}
