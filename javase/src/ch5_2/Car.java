package ch5_2;

public class Car 
{
//	static:修饰成员属性的方法，静态的，
	public String name="张三";
	public double price;
	public static String proName="中国制造";
	public static void addSu()
	{
		System.out.println("加速度！");
	}
	public void stop()
	{
		System.out.println("ProName:"+proName);
	}
}

