import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entered number of words: ");
        int numebrOfWords = scanner.nextInt();

        StringBuffer StringBuffer = new StringBuffer();

        for(int i = 0; i < numebrOfWords; i ++){
            System.out.print("Entered word: ");
            String word = scanner.next();
            StringBuffer.append(word.charAt(word.length()-1));
        }

        System.out.println(StringBuffer);

    }
}
