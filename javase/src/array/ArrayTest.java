package array;

public class ArrayTest {
	public static void main(String[] args)
	{
//		定义变量
		int[] a={1,2,3};
		int[] b={1,2,3};
		
//		System.out.println(a.length==b.length);
		int [][] i=new int[2][3];
		System.out.println("Is i an Object  "+(i instanceof Object));
		System.out.println("Is i[0] an int[]?  "+(i[0] instanceof int[]));
	}

}
