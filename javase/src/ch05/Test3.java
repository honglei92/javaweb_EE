package ch05;
public class Test3
{
	public void Test1()//方法1
	{
		System.out.println("双手不离键盘，下功夫找感觉");
	}
	public int getSum(int a,int b)//成员方法2
	{
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args)//main方法
	{
		Test3 t=new Test3();//新生成一个Test3()的实例
		System.out.println(t.getSum(10, 30));
		t.Test1();//调用Test1()方法
	}
}