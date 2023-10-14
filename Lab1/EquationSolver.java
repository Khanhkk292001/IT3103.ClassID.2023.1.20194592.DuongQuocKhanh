import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Solve a first-degree equation (ax + b = 0) with one variable.");
        System.out.println("2. Solve a system of first-degree equations (ax1 + bx2 = c, dx1 + ex2 = f) with two variables.");
        System.out.println("3. Solve a second-degree equation (ax^2 + bx + c = 0) with one variable.");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the value of a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter the value of b: ");
            double b = scanner.nextDouble();

            if (a == 0) {
                System.out.println("This is not a first-degree equation with one variable (a cannot be 0).");
            } else {
                double x = -b / a;
                System.out.println("The solution for x is: " + x);
            }
        } else if (choice == 2) {
            System.out.print("Enter the values of a11, a12, b1, a21, a22, b2 (space-separated): ");
            double a11 = scanner.nextDouble();
            double a12 = scanner.nextDouble();
            double b1 = scanner.nextDouble();
            double a21 = scanner.nextDouble();
            double a22 = scanner.nextDouble();
            double b2 = scanner.nextDouble();

            double D = a11 * a22 - a21 * a12;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;

            if (D == 0) {
                if (D1 == 0 && D2 == 0) {
                    System.out.println("The system has infinitely many solutions.");
                } else {
                    System.out.println("The system has no solution.");
                }
            } else {
                double x1 = D1 / D;
                double x2 = D2 / D;
                System.out.println("The solution for x1 is: " + x1);
                System.out.println("The solution for x2 is: " + x2);
            }
        } else if (choice == 3) {
            System.out.print("Enter the value of a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter the value of b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter the value of c: ");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;

            if (a == 0) {
                System.out.println("This is not a second-degree equation (a cannot be 0).");
            } else if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The solutions are real and distinct:");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The solution is a double root: " + root);
            } else {
                System.out.println("The equation has no real roots.");
            }
        } else {
            System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }

        scanner.close();
    }
}
