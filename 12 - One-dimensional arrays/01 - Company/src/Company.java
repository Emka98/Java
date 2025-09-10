class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[20];
        employees[0] = new Employee("Jan", "Nowak", 3500);
        employees[1] = new Employee("Marta", "Zięba", 3700);
        employees[2] = new Employee("Karol", "Wojak", 4500);

        int employeesSize = employees.length;
        System.out.println("Wielkość tablicy: " + employeesSize);
        System.out.println("Ostatni element tablicy to: " + employees[employeesSize - 1]);
    }
}