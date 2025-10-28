import java.util.Scanner;

public class CalulatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        double a = sc.nextInt();
        System.out.print("Enter opaerator: ");
        char opaerator = sc.next().charAt(0);
        System.out.print("Enter number: ");
        double b = sc.nextInt();

        cal.calculator(a, b, opaerator);



    }
}