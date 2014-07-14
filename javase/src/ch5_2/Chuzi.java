package ch5_2;

public class Chuzi 
{
	private void do1()
	{
		System.out.println("洗菜！");
	}
	private void do2()
	{
		System.out.println("切菜！");
	}
	private void do3()
	{
		System.out.println("做菜！");
	}
	public void Result()
	{
		Chuzi c=new Chuzi();
		c.do1();
		c.do2();
		c.do3();
		System.out.println("饭做好了！");
	}
}
