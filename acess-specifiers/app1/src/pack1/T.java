package pack1;
class S
{
	private S()
	{
          System.out.println("Q()");
	}
	S(int i)
	{
	}
}
class T extends S
{
	T()
	{
		super(10);
	}

}

