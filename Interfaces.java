import java.util.Scanner;

interface TextService {
    int countCharacter(String text, char ch);
}
class TextAnalyzer implements TextService {
    public int countCharacter(String text, char ch) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) count++;
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TextService service = new TextAnalyzer();

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        int result = service.countCharacter(text, ch);

        System.out.println("Character '" + ch + "' found " + result + " times.");

        sc.close();
    }
}
