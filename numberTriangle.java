import java.util.Scanner;

public class numberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        int num = 1; // starting number

        for (int i = 1; i <= rows; i++) { // rows
            for (int j = 1; j <= i; j++) { // numbers in each row
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        sc.close();
    }
}
