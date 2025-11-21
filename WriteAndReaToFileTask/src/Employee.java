class Employee extends Person {

    private double sallary;

    public Employee(String name,String surename,double sallary){
        super(name, surename);
        this.sallary = sallary;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return super.toString() + " Sallary USD: " + sallary;
    }
}