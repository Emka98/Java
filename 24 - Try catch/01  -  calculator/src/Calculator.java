import java.lang.ArithmeticException;

class Calculator{

    public void calculator(double a, double b, char opearator){
        try {
            if (opearator != '+' && opearator != '-' && opearator != '*' && opearator != '/') {
                throw new UnknownOperatorException("Invalid operator");
            }

            switch (opearator) {
                case '+' -> add(a, b);
                case '-' -> subtraction(a, b);
                case '/' -> division(a, b);
                case '*' -> multiplication(a, b);
            }
        } catch (UnknownOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void add(double a, double b){
        System.out.printf("%.2f + %.2f = %.2f%n", a, b, a + b);
    }

    private void subtraction(double a, double b){
        System.out.printf("%.2f - %.2f = %.2f%n", a, b, a - b); 
    } 

    private void multiplication(double a, double b){
        System.out.printf("%.2f * %.2f = %.2f%n", a, b, a*b); 
    }

    private void division(double a, double b){
        try{
            System.out.printf("%.2f / %.2f = %.2f%n", a, b, a/b);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
    } 

}
