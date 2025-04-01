package SrarPattern;

public class I3 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i<=5 ; i++) // for row
		{
			for( int k = 1 ; k<=i ; k++)
			{
				System.out.print(" ");
			}
			//for(int j = 5 ; j>=i ; j--)
			for(int j = i ; j<=5 ; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
