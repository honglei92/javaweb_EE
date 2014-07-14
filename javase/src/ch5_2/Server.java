package ch5_2;

public class Server 
{
	private void Write()
	{
		System.out.println("记下来！");
	}
	public void Order(Chuzi c)
	{
		Server s=new Server();
		s.Write();
		System.out.println("订单已经订好了");
		c.Result();
	}
}
