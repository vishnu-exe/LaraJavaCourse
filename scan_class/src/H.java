import java.util.Scanner;
class H
{
	public static void main(String[] args) 
	{
		System.out.println("Please Enter Student Details");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Student Name");
		String v1= sc.nextLine();
        System.out.println("Please Enter Student Initials");
		char v2= sc.next().charAt(0);
		System.out.println("Please Enter Student Roll NUmber");
		int v3= sc.nextInt();
		System.out.println("Please Enter Student age");
		int v4= sc.nextInt();
		System.out.println("Please Enter Student course");
		String v5= sc.next();
		sc.nextLine();
		System.out.println("Please Enter Student skills");
		String v6= sc.nextLine();
		System.out.println("Please Enter Course Fee");
		double v7= sc.nextDouble();
		System.out.println("job offer");
		boolean v8= sc.nextBoolean();
		System.out.println("student name :  " + v1);
		System.out.println("student intials :  " + v2);
		System.out.println("student roll number :  " + v3);
		System.out.println("student age :  " + v4);
		System.out.println("student course :  " + v5);
		System.out.println("student skils :  " + v6);
		System.out.println("course fee :  " + v7);
		System.out.println("Job offer :  " + v8);
	}
}
