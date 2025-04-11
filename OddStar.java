package SrarPattern;

public class OddStar {
    public static void main(String[] args) {
        // Define the number of lines in the pattern
       

        // Loop through each line
        for (int i = 1; i <= 5; i++) {
            // Print the asterisks for the current line
        	for(int k = 0;k<=2*(5-i);k++)
        	{
        		System.out.print(" ");
        	}
        	
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
