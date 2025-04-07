package SrarPattern;

public class IMP4 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i<=5 ; i++)
		{
			for(int k = 1 ; k<=2*(5-i); k++) // spaces
			{
				System.out.print(" ");
			}
			
			for(int j=i ; j>=1 ; j--) // inner loop for print first part
			{
				System.out.print(j+" ");
			}
			
			for(int j = 2 ; j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
