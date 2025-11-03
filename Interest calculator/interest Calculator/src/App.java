public class App {
    public static void main(String[] args) throws Exception {
    
    float deposit = 6000.0f;
    float numDays = 180;
    float interestRate = 0.03f;
    final float daysInYear = 365;
    float tax = 0.19f;

    float interest = (deposit * numDays * interestRate) / daysInYear;
    float taxToPay = interest * tax;
    System.out.printf("Zarobione odsetki: %.2f\n",interest);
    System.out.printf("Podatek do zapłaty: %.2f\n",taxToPay);
    System.out.printf("Zysk netto: %.2f\n",interest-taxToPay);


    }
}
