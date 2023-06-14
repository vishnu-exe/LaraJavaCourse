class C 
{
	C()
	{
		System.out.println("C()");
	}
	{
		System.out.println("IIB"); // INSTANCE INITIALIZATION BLOCK
	}
	C(int i)
	{
		System.out.println("C(int)");
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("--------");
		C c2 = new C(10);
		System.out.println("--------");
	}
}