package SrarPattern;

public class J1 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i<=5 ; i++)
		{
			for( int k = 1 ; k<=(5-i); k++)
			{
				System.out.print(" ");
			}
			for(int j = 1 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
		for(int  i = 1 ; i<=4 ; i++)
			{
				for(int k = 1 ; k <=i ; k++)
				{
					System.out.print(" ");
				}
				for(int j = 4 ; j>=i ; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		
	}

}
