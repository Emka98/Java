class ComputerStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Intel i5");
        Computer comp2 = new Computer("AMD Ryzen 1700");

        comp1.printInfo();
        comp2.printInfo();
        
        comp1.processor = "Intel i7"; //wymieniamy procesor
        comp1.printInfo();
    }
}