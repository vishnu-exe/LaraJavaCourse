class java
{
public static void main(String[] args) 
{
System.out.println("main begin");

{
int i = 10;
System.out.println("block1-stmt1");
System.out.println("block1-stmt2");
System.out.println("block1-stmt3");
System.out.println("block1-stmt4");
}

System.out.println("some thing:" + i);

{
System.out.println("block2-stmt1");
System.out.println("block2-stmt2");
System.out.println("block2-stmt3");
System.out.println("block2-stmt4");
}
System.out.println("main end:");
}
}