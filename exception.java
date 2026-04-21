import java.io.*;

class ExceptionDemo {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        try {
            
            int a = 10 / 0;

            
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);

            checkAge(15);

        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception caught: " + e);
        } 
        catch (Exception e) {
            System.out.println("General Exception caught: " + e);
        } 
        finally {
            // 'finally' always executes
            System.out.println("Finally block executed");
        }
    }
}
