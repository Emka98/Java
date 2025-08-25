public class App {
    public static void main(String[] args) throws Exception {

        int x = 5;
        int y = 6;

        System.out.printf("Result x > y = %b\n", x > y);
        System.out.printf("Result x * 2 > y = %b\n", 2*x > y);
        System.out.printf("Result x * y is even %b\n", (x*y)%2 == 0 );
    }
}
