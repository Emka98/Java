import java.util.Scanner;

public class GeometryApp {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcom in geomiter caltulator");
    System.out.println("Chose what shape you wannt calculate:");
    System.out.println("1 - Rectangel");
    System.out.println("2 - Triangle");
    System.out.println("3 - Ciecle");
    System.out.print("Your choice: ");
    int choice = sc.nextInt();

    switch (choice) {
        case 1:
            System.out.print("Enter a value: ");
            double a = sc.nextDouble();
            System.out.print("Enter b value: ");
            double b = sc.nextDouble(); 
            Rectangle rectangel = new Rectangle(a, b);
            System.out.printf("Rectangle aera: %f permimeter: %f",rectangel.calculateArea(),rectangel.calculatePerimeter());
            break;

        case 2: 
            System.out.print("Enter base value: ");
            double base = sc.nextDouble();
            System.out.print("Enter height value: ");
            double h = sc.nextDouble(); 
            Triangle triangle = new Triangle(base,h);
            System.out.printf("Triangle aera: %f permimeter: %f",triangle.calculateArea(),triangle.calculatePerimeter());
            break;

        case 3: 
            System.out.print("Enter ridial value: ");
            double ridial = sc.nextDouble();
            Circle circle = new Circle(ridial);
            System.out.printf("Circle aera: %f permimeter: %f",circle.calculateArea(),circle.calculatePerimeter());
            break;
            
        default:
            System.out.println("Your choice out of range");
            break;
    }
    }
}
