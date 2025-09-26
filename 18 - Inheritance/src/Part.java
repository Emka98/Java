class Part {

    private String IDnumber;
    private String nameOfProducer;
    private String model;
    private String serialNumber;

    public Part(String iDnumber, String nameOfProducer, String model, String serialNumber) {
        IDnumber = iDnumber;
        this.nameOfProducer = nameOfProducer;
        this.model = model;
        this.serialNumber = serialNumber;
    }
    public String getIDnumber() {
        return IDnumber;
    }
    public void setIDnumber(String iDnumber) {
        IDnumber = iDnumber;
    }
    public String getNameOfProducer() {
        return nameOfProducer;
    }
    public void setNameOfProducer(String nameOfProducer) {
        this.nameOfProducer = nameOfProducer;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    
    




    

}
