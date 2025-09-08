class UserManager {
    public static void main(String[] args) {
        User user = new User("Jan", "Kowalski");

        System.out.println("Select an option:");
        System.out.println("0 - exit the program");
        System.out.println("1 - display user information");
        System.out.println("2 - modify user data");

        int option = 1;

        if (option == 0) {
            System.out.println("Bye bye!");
        } else if (option == 1) {
            System.out.println("User: " + user.getFirstName() + " " + user.getLastName());
        } else if (option == 2) {
            user.setFirstName("Marian");
            user.setLastName("Powolny");
            System.out.println("User details changed to: " + user.getFirstName() + " " + user.getLastName());
        }
    }
}
