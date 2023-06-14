// single inheritance
//parent//base//super-class
class A 
{
	int i;
}
//child//derived//sub-class
class B extends A // can extend to  only one class at a time
{
    int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
 
/* inheritance is a process of acquiring the properties of another class

By using inheritance, we can achieve code reusability.