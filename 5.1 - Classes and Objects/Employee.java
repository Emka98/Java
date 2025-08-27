class Employee {

    String name;
    String surename;
    String date;
    double experience;

    public Employee() {
    }

    public Employee(String date, double experience, String name, String surename) {
        this.date = date;
        this.experience = experience;
        this.name = name;
        this.surename = surename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}