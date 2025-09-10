class Car {
    public static void main(String[] args) throws Exception {
        
        //Stores whole numbers from -128 to 127
        byte numberOfDoors = 5;

        //Stores whole numbers from -32,768 to 32,767
        short enginePowerHP = 500;

        //Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int maxSpeedMPH = 80;

        //Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float accelerationTimeTo100MPH = 7.5f;

        //Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        double timeOfBreakingFrom100MPH = 2.56;

        //Stores true or false values
        boolean isElectric = false;

        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Engine power: " + enginePowerHP + " HP");
        System.out.println("Max speed: " + maxSpeedMPH + " MPH");
        System.out.println("Acceleration (0-100 MPH): " + accelerationTimeTo100MPH + " sec");
        System.out.println("Time of breaking from 100 MPH: " + timeOfBreakingFrom100MPH );        
        System.out.println("Is electric: " + isElectric);

    }
}
