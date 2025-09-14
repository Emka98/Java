import java.util.Scanner;

class Hospital {

    private final static int MAX_PEOPLE = 10; 
    private int amountPatients = 0;
    private Patient[] hospital = new Patient[MAX_PEOPLE];

    void addPatient(){
        try (Scanner input = new Scanner(System.in)) {
            
            Patient patient = new Patient();

            System.out.print("Enter name: ");
            patient.setName(input.nextLine());
            System.out.print("Enter surename: ");
            patient.setSurename(input.nextLine());
            System.out.print("Enter idnumber: ");
            patient.setIdnumber(input.nextLine());

            hospital[amountPatients] = patient;
            amountPatients += 1; 
        }
    }

    void showPatients(){
        for(int i = 0; i < amountPatients; i++){
            System.out.printf("Pancjent %d %s %s %s",i+1,hospital[i].getName(),
                hospital[i].getSurename(),hospital[i].getIdnumber()
            );
        }
    }
}

