class FactorialApp {
    public static void main(String[] args) {
     
        System.out.println(factorial(5));
        
    }

    static int factorial(int n){
        int sum = 1;
        while (n > 1) {
            sum = sum * n ;
            n--;
        }
        return sum;
    }
}