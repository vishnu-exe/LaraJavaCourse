public class ThisDemo 
{
	int a, b;

	ThisDemo(int a, int b)
	{
	    this.a=a;
	    this.b=b;
	}


	public static void main(String[] args) 
	{
        ThisDemo obj= new ThisDemo(1,2);	        	     
        System.out.println(obj.a);
	        System.out.println(obj.b);
	}
}