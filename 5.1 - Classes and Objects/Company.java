class Company {

    public static void main(String[] args) {

    Employee emp1 = new Employee("02.11.1998", 10 , "Emil", "Gulinski");
    Employee emp2 = new Employee();
    Employee emp3 = emp2;

    System.out.printf("Name: %s Surename: %s Date: %s Experience: %.2f ", emp1.getName(), emp1.getSurename(), emp1.getDate(), emp1.getExperience());
    System.out.printf(emp2.getName());
    System.out.printf(emp3.getName());
    }
}