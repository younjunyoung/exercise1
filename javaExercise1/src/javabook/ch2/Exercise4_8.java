package javabook.ch2;

public class Exercise4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		for(x=0;x<11;x++)
		{
			for(y=0; y<11; y++)
			{
				if(x+2*y==5)
				{
					System.out.println("x="+x+  " y="+y);
				}
			}
		}
	}

}
