package arr;

public class Test {
	public static void main(String[] args) {
		int[] score = { 1, 6, 3, 8, 5 };
		for (int i = 0; i < score.length - 1; i++)
		// 最多做score-1i次排序
		{
			for (int j = 0; j < score.length - i - 1; j++) {
				if (score[j] < score[j + 1]) {
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}
		System.out.println("最终排序结果为：");
		for (int a = 0; a < score.length; a++) {
			System.out.print(score[a] + "\t");
		}
	}
}