public class interestCalculator {
    public static void main(String[] args) throws Exception {

        float deposit = 1000f;
        int daysindeposit = 180;
        float interestRate = 0.06f; 
        final int daysinYear = 365;
        float tax = 0.19f;
        float interest;
        float profit;

        interest = deposit * daysindeposit * interestRate / daysinYear;
        profit = interest * (1-tax);

        System.out.println(interest);
        System.out.println(profit);
    }
}
