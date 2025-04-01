package SrarPattern;

public class IMP1 {
    public static void main(String[] args) {
        int n = 6; // Number of rows for the diamond pattern
        
        // Print the top half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            System.out.print(" ".repeat(n - i));
            
            // Print stars with spaces in between
            for (int j = 1; j <= 2 * i - 1; j++) {
                // Print stars at the beginning and end of each row, and spaces in between
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Print the bottom half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            System.out.print(" ".repeat(n - i));

            // Print stars with spaces in between
            for (int j = 1; j <= 2 * i - 1; j++) {
                // Print stars at the beginning and end of each row, and spaces in between
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
