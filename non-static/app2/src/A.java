class A 
{
	A()
	{
		System.out.println("From A()");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("Done");
	}
}


// what is a constructor
// constructor is a special type of method, BUT IT'S NOT A REGULAR METHOD , internally compiler will be considering it as a method.
// constructor doesnot have a return type.
// constructors are mainly used for intializing objects.
//if there is no constructor defined , compiler keeps a default constructor ==> No Argument constructor.

// RULES FOR A CONSTRUCTOR
---------------------------

/* 1 .constructor name must be same as class name
   2. constructors must not have a return type
   3. constructor must be having a body  {}
   4. constructors can have access specifiers or access modifiers
   5. can take any number of arguments
   6. excuted while creating the object to that particular class
   7.
   
   
*/