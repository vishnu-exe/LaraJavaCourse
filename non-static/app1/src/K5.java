class K5
{
	 static int i;
	 static K5 k5 = new K5();
	 static
	{
       k5.i = 50;
	}
	public static void main(String[] args) 
	{
	
		System.out.println(i);
	}
	
	
}


// non-static member is intialized with a deafult value for each object creation , each time diiferent copy is used.
// static member is only loaded when the class is loaded , and only one copy of member is there.
