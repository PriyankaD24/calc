import java.util.Scanner;

public class AdditionProgram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculate sum
        double sum = num1 + num2;
        double product = num1 * num2;

        // Display result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is: "+ product);

        // Close the scanner
        scanner.close();
    }
}

