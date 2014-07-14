package ch04;
import java.util.Scanner;;
public class Test2 {
	public static void main(String[] args)
	{
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			Scanner scanner =new Scanner(System.in);
			System.out.println("请输入：");
			int a=scanner.nextInt();
			arr[i]=a;
		}
		System.out.println(arr[4]);
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("平均分是："+sum/arr.length);
	}
}
