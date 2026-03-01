public class Strings {
    public static int countUsingIndexOfIterative(String s1,String s2){
        int count = 0;
        int index = 0;
        while((index = s1.indexOf(s2,index) ) != -1){
            count++;
            index++;
        }
        return count;
    }
    public static int countUsingIndexOfRecursive(String s1, String s2, int index) {
    int found = s1.indexOf(s2, index);

    if (found == -1)
        return 0;

    return 1 + countUsingIndexOfRecursive(s1, s2, found + 1);
}
public static int countUsingSubstringIteratively(String s1, String s2) {
    int count = 0;

for(int i=0;i<=s1.length()-s2.length();i++){
    if(s1.substring(i,i+s2.length()).equals(s2)){
        count ++;
    }
}
    return count;

}
public static int countUsingSubstringrRcursively(String s1, String s2,int index) {
    if(index >s1.length() - s2.length()){
        return 0;
    }
     if(s1.substring(index,index+s2.length()).equals(s2)){
        return 1 + countUsingSubstringrRcursively( s1, s2,index + 1);
    }else{
        return  countUsingSubstringrRcursively(s1, s2,index + 1);
    
    }
}
    public static int countManualByIterative(String s1,String s2){
        int count =0;
        for(int i=0;i<= s1.length() - s2.length() ; i++){
            int j;
            for( j=0;j<s2.length();j++){
                if(s1.charAt(i +j ) != s2.charAt(j))
                    break;
            }
            if(j == s2.length()){
                count ++;
            }
        }
       
        return count;

    }
    public static int countManualByRecursively(String s1,String s2,int index){
    if (index > s1.length() - s2.length())
        return 0;

    int j = 0;
    while (j < s2.length() && s1.charAt(index + j) == s2.charAt(j)) {
        j++;
    }

    if (j == s2.length())
        return 1 + countManualByRecursively(s1, s2, index + 1);
    else
        return countManualByRecursively(s1, s2, index + 1);

}
public static void main(String [] args){
     String s1 = "abababcababa";
        String s2 = "aba";

        System.out.println("IndexOf Iterative: " + countUsingIndexOfIterative(s1, s2));
        System.out.println("IndexOf Recursive: " + countUsingIndexOfRecursive(s1, s2, 0));

        System.out.println("Substring Iterative: " + countUsingSubstringIteratively(s1, s2));
        System.out.println("Substring Recursive: " + countUsingSubstringrRcursively(s1, s2, 0));

        System.out.println("Manual Iterative: " + countManualByIterative(s1, s2));
         System.out.println("Manual Recursive: " + countManualByRecursively(s1, s2, 0));

    

    

}
}
