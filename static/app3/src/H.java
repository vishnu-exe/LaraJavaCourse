class H
	{
		static int i = test();
        static int j;
		static int test()
		{
          System.out.println(j);
          return j;
		}

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
