import java.util.Scanner;

class ContactApp {
    public static void main(String[] args) {
        ContactManager contactManager = ContactReader.readFile("contacts.csv");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        if (contactManager.findByEmail(email).isEmpty()){
            System.out.println("Brak kontaktu w bazie");
        } else{
            System.out.println("Kontakt o wskazanym adresie email:");
            System.out.println(contactManager.findByEmail(email).get().getShortInfo());
        }
    }
}