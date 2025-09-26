class Exhaust extends Part{

    private boolean conformityOfEUStandard;
    
    public Exhaust(String iDnumber, String nameOfProducer, String model, String serialNumber,
            boolean conformityOfEUStandard) {
        super(iDnumber, nameOfProducer, model, serialNumber);
        this.conformityOfEUStandard = conformityOfEUStandard;
    }
    public boolean isConformityOfEUStandard() {
        return conformityOfEUStandard;
    }
    public void setConformityOfEUStandard(boolean conformityOfEUStandard) {
        this.conformityOfEUStandard = conformityOfEUStandard;
    }

    




    

}
