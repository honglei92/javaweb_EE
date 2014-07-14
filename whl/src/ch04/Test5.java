package ch04;
public class Test5
{
	//对两个数组中的素有元素进行升序排序
	public static void main(String[] args)
	{
		int[] a1={1,6,7,9};
		int[] b1={2,5,8,12,15};
		int[] c=new int[a1.length+b1.length];
		int a=0;
		int b=0;
		for(int i=0;i<c.length;i++)
		{
			if(a<a1.length&&b<b1.length)
			{
				if(a1[a]<=b1[b])
				{
					c[i]=a1[a];
				}
			}
		}
	}
}