class B 
{
	B()
	{
		System.out.println("A()");
	}
	{
		System.out.println("IIB"); // INSTANCE INITIALIZATION BLOCK
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("--------");
		B b2 = new B();
		System.out.println("--------");
	}
}
// IIB BLOCKS ARE NON STATIC
// WE CAN CREATE ANY NUMBER OF IIB BLOCKS
// NEED OF IIB BLOCK : IF THERE IS ANY COMMOM IMPLEMENTATION FOR OBJECTS , IBB IS USED
