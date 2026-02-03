import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

class TimeTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("To start the measurement, press Enter: ");
        sc.nextLine();
        Instant i1 = Instant.now();
        
        System.out.print("To stop the measurement, press Enter: ");
        sc.nextLine();
        Instant i2 = Instant.now();

        System.out.println("Time: " + Duration.between(i1, i2).toMillis() + " ms");
    }
}