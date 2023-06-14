/* class A
{
    int i;
	void test1()
	{
		System.out.println("A-test");
	}
}

class F
{
	A obj;
	F(A obj)
	{
		this.obj = obj;
	}
	void test2()
	{
		System.out.println("F-test");
		System.out.println(obj.i);
		obj.test1();
	}
		
	public static void main(String[] args) 
	{
		A a1 = new A();
		F f1 = new F(a1);
		f1.test2();

		F f2 =new F(new A());
		f2.test2();
	}
} */

class A
{
        A( int i)
        {
                System.out.println("A()");
        }

}
class T extends A
{
        T(int i)
        {
                System.out.println("T(int)");
        }
        public static void main(String[] args) 
        {
                T t1 = new T(90);
                System.out.println("done");
        }
}