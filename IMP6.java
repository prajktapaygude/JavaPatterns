package SrarPattern;

public class IMP6 {
	public static void main(String[] args) {
		
		for(int i = 1; i<=5 ; i++)
		{
			for(int j=1; j<=5 ; j++)
			{
				if(i==1||j==1||i==5||j==5)
				{
					System.out.print("*"+" ");// 1 space
				}
				else
				{
					System.out.print("  "); // 2 space
				}
			}
			System.out.println();	
		}
	}

}
