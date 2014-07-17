package ch05;

import java.util.Scanner;

public class Test4
{
	public int findIndex(String string,int start,int end,String str)
	{
		int temp=-1;
		for(int i=start;i<=end;i++)
		{
			if(str.equals(string.charAt(i)+""))
			{
				temp=i;
			}
		}
		return temp;
	}
	public static void main(String[] args)
	{
		Test4 t=new Test4();
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String string=scanner.next();
		Scanner scanner2=new Scanner(System.in);
		System.out.println("请输入一个开始的索引值：");
		int start =scanner2.nextInt();
		Scanner scanner3=new Scanner(System.in);
		System.out.println("请输入一个结束的索引值：");
		int end=scanner3.nextInt();
		Scanner scanner4=new Scanner(System.in);
		System.out.println("请输入一个要找的字符：");
		String str=scanner4.next();
		int falg=t.findIndex(string, start, end, str);
		if(falg!=-1)
		{
			System.out.println("我到了，索引值是："+falg);
		}
		else
		{
			System.out.println("对不起，没找到！");
		}
	}
}