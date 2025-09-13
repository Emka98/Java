import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);


        System.out.print("Eneter amount of numebrs: ");
        int reps = input.nextInt();
        
        int tmp = 0;
        int i = 0;

        while (i < reps) {
            System.out.printf("Eneter %d numebrs: ",i+1);
            tmp += input.nextInt();
            i += 1;
        }

        System.out.printf("Sum of numbers: %d",tmp);
    }
}
