class HelloName {

    public static void main(String[] args) {
        final String krzysiek = "Krzysiek";
        final String maciek = "Maciek";
        final String marek = "Marek";

        String name = "Marek";

        switch (name) {
            case krzysiek:
                System.out.println("Hey Krzychu! Welcome to the program.");
                break;
            case maciek:
            case marek:
                System.out.println("Welcome, Mr. President. How's your day going?");
                break;
            default:
                System.out.println("Welcome, unknown user!");
        }
    }
}