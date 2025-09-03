class CalcTest {
    public static void main(String[] args) {
        
        int a = 5; 
        int b = 5;
        int c = 10;
        
        Calculator cal = new Calculator();
        System.out.println(cal.add(a, b));
        System.out.println(cal.add(a, b, c));
        System.out.println(cal.subtract(a, b));
        System.out.println(cal.subtract(a, b, c));
    }

}
