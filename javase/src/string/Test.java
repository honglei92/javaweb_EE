package string;
public class Test
{
/*
 * 对一组英文字母大小写互换
 * */
	public static void main(String[] args)
	{
//		实例化一个StringBuffer类
		StringBuffer sb=new StringBuffer(" I LOVE YOU");
//		循环语句
		for(int i=0;i<sb.length();i++)
		{
//			实例化一个char变量
			char temp=sb.charAt(i);
//			if else控制语句
			if(temp>='A'&&temp<='Z')
			{
				sb.setCharAt(i, (char)(temp+32));
			}
			else if(temp>='a'&&temp<='z')
			{
				sb.setCharAt(i, (char)(temp-32));
			}
		}
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}