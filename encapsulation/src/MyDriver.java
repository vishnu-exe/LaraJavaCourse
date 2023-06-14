class A 
{
	//data members
	private String name;
	private int rollNumber;
	private int age;

	//read-only //getter methods
	// getter and setter must be public
	public String getName()
	{
		return name; //this.getName;
	}
	public int getRollNumber()
	{
		return rollNumber; //this.rollNumber;
	}
	public int getAge()
	{
		return age; //this.age;
	}
	public void setName(String namee)
	{
          this.name = name;
	}
	public void setRollNumber(int rollNumber)
	{
          this.rollNumber = rollNumber;
	}
	public void setAge(int age)
	{
          this.age = age;
	}

}

class MyDriver
{

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.getName());
		System.out.println(a1.getRollNumber());
		System.out.println(a1.getAge());
		System.out.println("----------");
        a1.setName("VISHNU");
		a1.setRollNumber(47);
		a1.setAge(25);
		System.out.println(a1.getName());
		System.out.println(a1.getRollNumber());
		System.out.println(a1.getAge());
	}
}
