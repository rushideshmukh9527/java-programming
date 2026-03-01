import java.util.Scanner;

public class Factorial {

    public static long factorialRecursive(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;  
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorialRecursive(number - 1);
    }

    public static long factorialIterative(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;  
        }

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long recursiveResult = factorialRecursive(number);
        long iterativeResult = factorialIterative(number);

        if (recursiveResult != -1) {
            System.out.println("Recursive Factorial: " + recursiveResult);
        }

        if (iterativeResult != -1) {
            System.out.println("Iterative Factorial: " + iterativeResult);
        }

        scanner.close();
    }
}
