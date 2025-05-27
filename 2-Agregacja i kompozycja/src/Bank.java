public class Bank {
    public static void main(String[] args) {

        //First person
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "123456789";
        person1.street = "Uliczna";
        person1.houseNumber = 5;
        person1.flatNumber = 2;
        person1.city = "Warsaw";
        person1.postkod = "00-225";

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 2000;
        credit1.intterestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba:");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("posiada konto bankowe z kwota: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);










    }
}
