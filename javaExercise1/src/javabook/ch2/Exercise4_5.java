package javabook.ch2;

public class Exercise4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<=10)
		{
			int j=0;
			while(j<=i)
			{
				System.out.printf("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
