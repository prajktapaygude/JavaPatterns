package SrarPattern;

public class I2 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i<=5 ; i++) // for row
		{
			for( int k = 1 ; k<=i ; k++)
			{
				System.out.print(" ");
			}
			for(int j = 5 ; j>=i ; j--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
