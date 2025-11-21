import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {

        Company warsawCompany = new Company();
        WriteAndReadToFile wrToFile = new WriteAndReadToFile();
        String fileName = "wrs.obj";
        factoryEmploye factoryEmp = new factoryEmploye();

        try (Scanner sc = new Scanner(System.in)) { 
            while (true) {
                System.out.println("Welcom in program chose one of option: ");
                System.out.println("1 - Add Employee");
                System.out.println("2 - Show Employee");
                System.out.println("3 - Save to file");
                System.out.println("4 - Read Emolyee from file");
                System.out.println("5 - exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        warsawCompany.addEmployee(factoryEmp.newEmployee());
                        break;
                    case 2:
                        warsawCompany.showEmployee();
                        break;
                    case 3:
                        wrToFile.ObjectWriter(fileName,warsawCompany);
                        break;
                    case 4:
                        warsawCompany = wrToFile.ObjectReader(fileName);
                        break;
                    case 5:
                        return; 
                    default:
                        System.out.println("Don`t knows answer!!!");
                        break;
                }
            }
        }
    }
}