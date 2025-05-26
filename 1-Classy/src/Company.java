class  Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.firstName = "Jan";
        emp1.lastName = "Kowalski";
        emp1.birthYear = 1987;
        emp1.seniority = 4;

        Employee emp2 = new Employee();
        emp2.firstName = "Maria";
        emp2.lastName = "Dawidowska";
        emp2.birthYear = 1992;
        emp2.seniority = 2;

        Employee emp3 = new Employee();
        emp3.firstName = "Kamila";
        emp3.lastName = "Płatek";
        emp3.birthYear = 2000;
        emp3.seniority = 6;

        System.out.println("Imię: " + emp1.firstName + " Nazwisko: " + emp1.firstName
                +  " Rok urodzenia: " + emp1.birthYear + " Staż: " + emp1.seniority);

        System.out.println("Imię: " + emp2.firstName + " Nazwisko: " + emp2.firstName
                +  " Rok urodzenia: " + emp2.birthYear + " Staż: " + emp2.seniority);

        System.out.println("Imię: " + emp3.firstName + " Nazwisko: " + emp3.firstName
                +  " Rok urodzenia: " + emp3.birthYear + " Staż: " + emp3.seniority);

    }
}





