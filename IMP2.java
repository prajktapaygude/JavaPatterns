package SrarPattern;

public class IMP2 {
    public static void main(String[] args) {
        // Directly using the number 5 instead of a variable
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == 5 || j == i) {
                    System.out.print("* ");//star nanter space
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
