import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) throws Exception {
        
        try (Scanner input = new Scanner(System.in)) {
            Hospital hospital1 = new Hospital();

            while (true) {

                System.out.println("""
                        0 - exit
                        1 - add patient
                        2 - shot list of pattients
                        """
                    );

                System.out.println("Enter your answer: "); 
            
                int answer = input.nextInt();
                
                if (answer == 0) {
                    break;
                }
                else if (answer == 1){
                    hospital1.addPatient();
                }
                else if (answer == 2) {
                    hospital1.showPatients();
                }       
            }
        }
    }
} 
