import java.util.Scanner;

public class HinhThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                
                // Print stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                
                System.out.println(); // Move to the next line
            }
        }
    }
}