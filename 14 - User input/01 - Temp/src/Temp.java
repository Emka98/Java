import java.util.Scanner;

class Temp {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number: ");
    int number = scanner.nextInt();
    scanner.nextLine(); // Consume the leftover newline

    System.out.print("Enter sentence: ");
    String sentence = scanner.nextLine();

    System.out.println("Number: " + number);
    System.out.println("Sentence: " + sentence);
    System.out.println("Length sentence: " + sentence.length());
    
    }
}