package ch05;
public class Test3
{
	public void Test1()//方法1
	{
		System.out.println("要把米老师的话听进去，手不离开键盘");
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