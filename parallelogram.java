import java.util.*;

public class parallelogram {

    public static void printPattern(int n,int m) {
        int i, j;

        
        for (i = 1; i <= n; i++) {

            
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }


            for (j = 1; j <= m; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of rows: ");
        int n = sc.nextInt();
         System.out.print("Enter value of columns: ");
        int m = sc.nextInt();

        printPattern(n,m);

        sc.close();
    }
}
