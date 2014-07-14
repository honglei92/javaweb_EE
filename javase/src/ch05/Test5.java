package ch05;

import java.util.Scanner;

public class Test5 
{
	public long getSum(int start,int end,int add)
	{
		long sum=0;
		for(int i=start;i<=end;i+=add)
		{
			sum+=i;
		}
		return sum;
	}
	public String[] getArray(String[] arr)
	{
		String[] array=new String[arr.length];
		for(int i=0;i<array.length;i++)
		{
			array[i]=arr[i];
		}
		return array;
	}
	public static void main(String[] args)
	{
         /*Scanner scanner=new Scanner(System.in);
         System.out.println("请输入，用逗号隔开：");
         String str=scanner.nextLine();
         String[] arr=str.split(",");*/
         Test5 t=new Test5();
         System.out.println(t.getSum(1, 10, 2));
         /*String a[] =t.getArray(arr);
         for(int i=0;i<a.length;i++)
         {
        	 System.out.println(a[i]+" ");
         }*/
	}
	
}

