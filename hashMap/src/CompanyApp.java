import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
   
        try (Scanner sc = new Scanner(System.in)) {

            Company company = new Company();

            company.employees.put(company.employees.size(), new Employee("Emil","Gulinski","4000"));
            company.employees.put(company.employees.size(), new Employee("Kamila","Płatek","4000"));
            company.employees.put(company.employees.size(), new Employee("Edward","Gulinski","4000"));

            boolean loopcontroler = true;

            while (loopcontroler) {

                System.out.println("1 - add new employee");
                System.out.println("2 - search employee");
                System.out.println("3 - exit");
                System.out.print("Enter your choice: ");


                int choice = sc.nextInt();
                switch (choice) {
                    case 1 :
                        System.out.print("Enter name: ");
                        String Name = sc.next();
                        System.out.print("Enter surename: ");
                        String Surename = sc.next();
                        System.out.print("Entered salary: ");
                        String Salary = sc.next();
                        company.addEmployeeToComapany(Name,Surename,Salary);
                        break;

                    case 2:
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Enter surename: ");
                        String surename = sc.next();
                        company.searchEmployee(name,surename);
                        break;

                    case 3:
                        return;
                }
            }
        }
    }
}
