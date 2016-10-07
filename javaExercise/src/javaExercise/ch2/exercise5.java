package javaExercise.ch2;

public class exercise5 {

	public static void main(String[] args) {
		
		if(args.length!=1){
			System.out.println("USAGE: exercise5 3120");
			//System.exit(0);
		}
		
		int money = 3120;
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5,5,5,5};
		
		for(int i=0; i<coinUnit.length;i++)
		{
			int coinNum = 0;
			
			coinNum= money/coinUnit[i];
			if(coinNum>coin[i])
			{
				money-=coinUnit[i]*coin[i];
				coinNum=coin[i];
			}
			else
			{
				money-=coinUnit[i]*coinNum;
			}
			coin[i]-=coinNum;
			System.out.println(coinUnit[i]+"원: " +coinNum);
			
		}
	
		if(money>0)
		{
			System.out.println("거스름 돈이 부족합니다.");
			System.exit(0);
			
		}
		
		System.out.println("=남은 동전의 개수 =");
		
		for(int i=0; i<coinUnit.length;i++)
		{
			System.out.println(coinUnit[i]+"원:"+coin[i]);
		}
		
	
	
	}

}
