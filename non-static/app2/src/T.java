class T
{
	T()
	{
		System.out.println("T()");
	}
	T(int i)
	{
		T t1 = new T ();
		System.out.println("T(int)");
	}
		public static void main(String[] args) 
	{
		T t1 = new T();
		System.out.println("-------");
		T t2 = new T(10);
		System.out.println("-------");
		
	}
}