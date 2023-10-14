import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);

        System.out.print("Enter the second number: ");
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2);

        double tong = num1 + num2;
        double hieu = num1 - num2;
        double tich = num1 * num2;
        
        double thuong = 0.0;
        if (num2 != 0) {
            thuong = num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);

        scanner.close();
    }
}
