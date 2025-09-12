import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        try (Scanner input = new Scanner(System.in)) {

            Calculator cal = new Calculator();

            System.out.print("Enter first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter oparator: ");
            char oparator = input.next().charAt(0);

            System.out.print("Enter first number: ");
            int number2 = input.nextInt();

            System.out.printf("%d %c %d = %.2f\n", number1, oparator, number2, cal.clculator(number1, number2, oparator));
        }
    }
}
