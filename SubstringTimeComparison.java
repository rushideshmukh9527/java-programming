
public class SubstringTimeComparison {

    // Iterative Method
    public static int countIterative(String s1, String s2) {
        int count = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            if (s1.substring(i, i + s2.length()).equals(s2)) {
                count++;
            }
        }

        return count;
    }


    public static int countRecursive(String s1, String s2) {

        
        if (s1.length() < s2.length()) {
            return 0;
        }

        
        if (s1.substring(0, s2.length()).equals(s2)) {
            return 1 + countRecursive(s1.substring(1), s2);
        } else {
            return countRecursive(s1.substring(1), s2);
        }
    }

    public static void main(String[] args) {

        String s1 = "aba".repeat(1000);;
        String s2 = "aba";

        long startTime1 = System.currentTimeMillis();

        int iterativeCount = countIterative(s1, s2);

        long endTime1 = System.currentTimeMillis();

        long iterativeTime = endTime1 - startTime1;

    
        long startTime2 = System.currentTimeMillis();

        int recursiveCount = countRecursive(s1, s2);

        long endTime2 = System.currentTimeMillis();

        long recursiveTime = endTime2 - startTime2;

        System.out.println("Iterative Count: " + iterativeCount);
        System.out.println("Recursive Count: " + recursiveCount);

        System.out.println("Time taken by Iterative: " + iterativeTime + " ms");
        System.out.println("Time taken by Recursive: " + recursiveTime + " ms");
    }
}
