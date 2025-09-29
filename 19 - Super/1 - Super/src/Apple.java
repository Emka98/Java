class Apple extends Fruit {

    private String cultivar;
    
    public Apple(String type, double weight, String cultivars) {
        super(type, weight);
        this.cultivar = cultivars;
    }

    public String getCultivars() {
        return cultivar;
    }

    public void setCultivars(String cultivar) {
        this.cultivar = cultivar;
    }

    public String getInfo(){
        return String.format("%s cultivar: %s",super.getInfo(), cultivar);
    }
}
