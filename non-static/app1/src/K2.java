class KA
{
	int i;
	static KA k2 = new KA();
	static 
	{
		System.out.println("STATIC " + k2.i);
		
	}
		public static void main(String[] args) 
	{
		
		System.out.println(" MAIN " + k2.i);
	}
}
