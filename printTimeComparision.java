public class printTimeComparision {
     static void manualPrint() {
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
        System.out.println("Rushikesh");
    }

    // Loop printing
    static void loopPrint() {
        for(int i = 1; i <= 20; i++) {
            System.out.println("Rushikesh");
        }
    }

    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        manualPrint();
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        loopPrint();
        long end2 = System.currentTimeMillis();

        System.out.println("Manual Time: " + (end1 - start1) + " ms");
        System.out.println("Loop Time: " + (end2 - start2) + " ms");
    }
}
    

