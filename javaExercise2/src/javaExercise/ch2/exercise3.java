package javaExercise.ch2;

public class exercise3 {

	public static void main(String[] args) {

		int ballArr[] = {1,2,3,4,5,6,7,8,9};
		int ball3[] = new int[3];
		
		for(int x=0; x<20; x++)
		{
			int i= (int)(Math.random()* ballArr.length);
			int j= (int)(Math.random()*ballArr.length);
			int tmp = 0;
			
			tmp=ballArr[i];
			ballArr[i]=ballArr[j];
			ballArr[j]=tmp;
		}
		
		for(int x=0;x<3;x++)
		{
			ball3[x]=ballArr[x];
		}
	
		for(int i=0; i<ball3.length;i++)
		{
			System.out.print(ball3[i]);
		}

}

}