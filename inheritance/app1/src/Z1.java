class  A
{
	A()
	{
		this(10,20);
		System.out.println("A()");

	}
	A(int i , int j)
	{
		A a1 = new A(10,20,30);
		System.out.println("A(int, int)");

	}
	A(int i , int j, int k)
	{
		B b1 = new B();
		System.out.println("A(int, int,int)");

	}
	{
		C c1 = new C();
		System.out.println("A-SIB2");
	}
	static
	{
		A a1 = new A();
		System.out.println("A-SIB");
	}
	static
	{
		System.out.println("A-SIB2");
	}
}
class  B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
	static
	{
		System.out.println("B-SIB2");
	}
	
}
class  C extends B
{
	static 
	{
		System.out.println("C-SIB");
	}
	static 
	{
		System.out.println("C-SIB2");
	}
	
}

class Z extends C
{
	static 
	{
		System.out.println("Z-SIB");
	}
	static 
	{
		System.out.println("Z-SIB2");
	}

	public static void main(String[] args) 
	{
     
	   System.out.println("main"); 
	   
	  
	}
	   
}