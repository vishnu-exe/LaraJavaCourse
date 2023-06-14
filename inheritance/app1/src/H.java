class G
{
	static void test1()
	{
		System.out.println("G-test");
	}

}

class H extends G 
{
    static void test2()
	{
		System.out.println("H-test");
	}
	
	public static void main(String[] args) 
	{

		H.test1();
		H.test2();
	}
}
 