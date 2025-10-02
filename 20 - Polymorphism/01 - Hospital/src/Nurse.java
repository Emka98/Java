class Nurse extends Person {

    private double overtime;

    public Nurse(String name, String surename, double salary, double overtime) {
        super(name, surename, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override
    public String getInfo() {
        return String.format("%s Stanowisko: Piguła Nadgodziny: %f", super.getInfo(), overtime);
    }
}
