class KC
{
	 static int i;
	
	static 
	{
		KC k2 = new KC();
		System.out.println("STATIC " + k2.i);
		
	}
	public static void main(String[] args) 
	{
	
         KC k2 = new KC();
		System.out.println(k2.i);
	}
	
}
