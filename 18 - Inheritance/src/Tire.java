class Tire extends Part{

    private String Size;
    private String width;

    public Tire(String iDnumber, String nameOfProducer, String model, String serialNumber, String size, String width) {
        super(iDnumber, nameOfProducer, model, serialNumber);
        Size = size;
        this.width = width;
    }
    public String getSize() {
        return Size;
    }
    public void setSize(String size) {
        Size = size;
    }
    public String getWidth() {
        return width;
    }
    public void setWidth(String width) {
        this.width = width;
    }
    

    
    
}