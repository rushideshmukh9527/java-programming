import java.util.Scanner;

public class CharacterFrequencyVarargs {

    public static void countOccurrences(String text, char... characters) {
        for (char ch : characters) {
            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch) {
                    count++;
                }
            }

            System.out.println("Character '" + ch + "' occurs " + count + " time(s).");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        while (true) {
            System.out.print("Enter a string: ");
            text = scanner.nextLine();

            if (!text.trim().isEmpty()) {
                break;
            }

            System.out.println("Invalid input. String cannot be empty.");
        }

        int numberOfCharacters;

        while (true) {
            System.out.print("How many characters do you want to check? ");
            if (scanner.hasNextInt()) {
                numberOfCharacters = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (numberOfCharacters > 0) {
                    break;
                }
            } else {
                scanner.nextLine(); // clear invalid input
            }

            System.out.println("Please enter a valid positive number.");
        }

        char[] inputCharacters = new char[numberOfCharacters];

        // Validate each character input
        for (int i = 0; i < numberOfCharacters; i++) {
            while (true) {
                System.out.print("Enter character " + (i + 1) + ": ");
                String input = scanner.nextLine();

                if (input.length() == 1) {
                    inputCharacters[i] = input.charAt(0);
                    break;
                }

                System.out.println("Invalid input. Please enter exactly one character.");
            }
        }

        countOccurrences(text, inputCharacters);

        scanner.close();
    }
}
