class C
{
	int i = 100;
	C()
	{
		System.out.println("From B()");
		i = 10;
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("-------");
		System.out.println(c1.i);
	}
}
