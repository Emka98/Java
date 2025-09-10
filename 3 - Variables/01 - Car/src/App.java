class Car {
    public static void main(String[] args) throws Exception {
        
        String carBrand = "Honda";
        String model = "Accord";
        int yearOfProduction = 2010;
        double price = 20_000;
        String currency = "PLN";

        System.out.printf("Brand: %s\nModel: %s\nYear: %d\nPrice: %f %s", carBrand, model, yearOfProduction, price, currency);
    }
}
