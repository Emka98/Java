public class MotoShop {
    public static void main(String[] args) throws Exception {
        
        Tire tire1 = new Tire("1233456", 
        "Dębica", "Winter", 
        "9898989898", "R18", "15");
        
        Exhaust exhaust1 = new Exhaust("1555252",
        "Bossal", "Typer",
        "15151515", true);
    
        System.out.printf("%s\n %s\n %s\n %s\n %s\n %s",tire1.getClass(),tire1.getIDnumber(), 
        tire1.getModel(), tire1.getNameOfProducer(), tire1.getSerialNumber(),
        tire1.getSize(), tire1.getWidth());

        System.out.printf("%s\n %s\n %s\n %s\n %b",exhaust1.getClass(),exhaust1.getIDnumber(), 
        exhaust1.getModel(), exhaust1.getNameOfProducer(), exhaust1.getSerialNumber(), exhaust1.isConformityOfEUStandard());
    }
}
