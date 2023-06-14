class K1
	{
		static void test()
		{
			System.out.println(i);
		
	    }
		
		static
		{
		System.out.println(K1.i);
		test();
	    }
	public static void main(String[] args) 
	{
		System.out.println("main " + i);
	}
	static int i = 10;
	
		
        

}
