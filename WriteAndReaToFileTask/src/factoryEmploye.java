import java.util.Scanner;

public class factoryEmploye {

    Scanner sc = new Scanner(System.in);

    Employee newEmployee(){
        System.out.print("Enter name of new employee: ");
        String name = sc.nextLine();
        System.out.print("Enter surename: ");
        String surename = sc.nextLine();
        System.out.print("Enter sallary : ");
        double sallary = sc.nextDouble();
        return new Employee(name, surename, sallary);
    }
}
