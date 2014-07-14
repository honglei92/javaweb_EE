public class BubbleSort {
	public static void main(String[] args) {
		int score[]={4,3,9,8,6,7};
		for(int i=0;i<score.length-1;i++){
			for(int j=0;j<score.length-i-1;j++){
				if(score[j]<score[j+1]){
					int temp=score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
				}
			}
			System.out.print("第"+(i+1)+"次排序的结果是：");
			for(int a=0;a<score.length;a++){
				System.out.print(score[a]+"\t");
			}
			System.out.println("");
		}
		System.out.print("最终排序结果是：");
		for(int a=0;a<score.length;a++){
			System.out.print(score[a]+"\t");
		}
	}
}
