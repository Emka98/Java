class Doctor extends Person{

    private double bonus;

    public Doctor(String name, String surename, double salary, double bonus) {
        super(name, surename, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public String getInfo(){
        return String.format("%s Stanowisko: Doktor Bonus: %f", super.getInfo(), bonus);
    } 
}
