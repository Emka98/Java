class Person {

    private String name; 
    private String surename;
    private double salary;

    public Person(String name, String surename, double salary) {
        this.name = name;
        this.surename = surename;
        this.salary = salary;
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfo(){
        return String.format("Imię: %s Nazwisko: %s Wypłata: %f", name, surename, salary);
    }

}
