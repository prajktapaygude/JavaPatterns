package SrarPattern;

public class OddStar3 {
    public static void main(String[] args) {
        
    	for(int i = 1 ; i<=5; i++)
		{
			for(int k = 1 ; k<= 2 *(i); k++)
			{
				System.out.print(" ");
			}
			for(int j = 5 ; j>= 2*i-1 ; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
    }
}
