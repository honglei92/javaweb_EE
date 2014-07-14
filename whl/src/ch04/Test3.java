package ch04;
public class Test3
{
	public static void main(String[] args)
	{
		int a[]={10,8,23,100,9};
		int temp=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(temp<a[i])
			{
				temp=a[i];
			}
		}
		System.out.println("最大的数是"+temp);
		int max=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[max]<a[i])
			{
				max=i;
			}
		}
		System.out.println("最大的数是第"+(max+1)+"个数");
	}
}
