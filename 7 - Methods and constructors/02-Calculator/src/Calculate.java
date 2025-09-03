public class Calculate {
    public static void main(String[] args) {
        
        double a = 2.3;
        double b = 3.5;

        Calculator cal = new Calculator();

        System.out.println(cal.add(a, b));
        System.out.println(cal.subtract(a, b));
        System.out.println(cal.multiply(a, b));
        System.out.println(cal.divide(a, b));
    }   
}
