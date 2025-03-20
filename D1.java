package SrarPattern;

public class D1 {
	public static void main(String[] args) {
		
		int a = 0;
		for(int i = 1 ; i<=5 ;i++)
		{
			for(int j = 1 ; j<=i ; j++)
			{
				System.out.print(a);
				a=a+2;
				//System.out.print(a+" ");
			}
			System.out.println();
		}
	}

}
