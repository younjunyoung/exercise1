package javabook.ch2;

public class Exercise4_6 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<7;i++)
		{
			for(j=1;j<7;j++)
			{
				if(i+j==6)
				{	
					System.out.println("(" +i+ "," +j+ ")");
				}
			}
		}

	}

}
