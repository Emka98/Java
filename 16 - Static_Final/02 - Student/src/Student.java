class Student {
    
    private static int numbersOfStudents = 0;

    private String name;
    private String surename;
    private String indexnumber;

    public Student(String name, String surename, String indexnumber) {
        this.name = name;
        this.surename = surename;
        this.indexnumber = indexnumber;
        numbersOfStudents += 1;
    }

    public Student(String surename, String indexnumber) {
        this.surename = surename;
        this.indexnumber = indexnumber;
        numbersOfStudents += 1;
    }

    public Student(String indexnumber) {
        this.indexnumber = indexnumber;
        numbersOfStudents += 1;
    }

    public Student() {
        numbersOfStudents += 1;
    }

    public static int getNumbersOfStudents() {
        return numbersOfStudents;
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
    public String getIndexnumber() {
        return indexnumber;
    }
    public void setIndexnumber(String indexnumber) {
        this.indexnumber = indexnumber;
    }

    


     
}