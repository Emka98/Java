class calulatorConverter {
    public static void main(String[] args) {
        
    lengthUnitConverter lengthConv = new lengthUnitConverter();
    timeUnitConverter timeConv = new timeUnitConverter();

    int hours = 14;
    System.out.printf("%d hours converted to %d miliseconds",hours,timeConv.secondsToMiliseconds(timeConv.minutesToSeconds(timeConv.hoursToMinutes(hours))));
    }    
}
