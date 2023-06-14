class  A
{
	static
	{
		System.out.println("A-SIB");
	}
}
class  B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
}
class  C extends B
{
	
	static 
	{
		System.out.println("C-SIB");
	}
	
}

class Z11 
{
	static 
	{
		System.out.println("Z-SIB");
	}

	public static void main(String[] args) 3
	{
     
	   System.out.println("main begin"); 
	   A a1 = new A();
	   System.out.println("main begin"); 
	  
	}
	   
}