class Strings {
       public static void main(String [] args){
             String s1 = "USTAV";
            long st = System.nanoTime();
       for(int i=0 ;i<2026 ; i++){
             s1 += " _" + i + "_";
             
          }
             long ed = System.nanoTime();
             System.out.println("time taken by string" + "  " +(ed - st) + "ns");  
            

            StringBuffer s2 = new StringBuffer("USTAV");
            long sa = System.nanoTime();
        for(int i=0 ;i<2026 ; i++){
             s2.append(" _").append(i).append("_");

          }
           long sb = System.nanoTime();
           System.out.println("time taken by StringBuffer" + "  " +(sb - sa) + "ns");


StringBuilder s3 = new StringBuilder("USTAV");
            long sc = System.nanoTime();
        for(int i=0 ;i<2026 ; i++){
             s3.append(" _").append(i).append("_");

          }
           long sd = System.nanoTime();
           System.out.println("time taken by StringBuilder" + "  " +(sd - sc) + "ns");



     }
}








