class Calculate {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a = 10;
        double b = 5;

        //Print results
        System.out.println("Results of equation with variables a =  " + a + " b = "+ b);
        System.out.println("add "+ calc.add(a,b));
        System.out.println("subtract "+ calc.divide(a,b));
        System.out.println("multiply "+calc.multiply(a,b));
        System.out.println("divide "+calc.divide(a,b));
    }

}