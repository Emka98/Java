class Patient {

    private String name;
    private String surename;
    private String idnumber;    

    public Patient() {
    }

    public Patient(String idnumber) {
        this.idnumber = idnumber;
    }

    public Patient(String surename, String idnumber) {
        this.surename = surename;
        this.idnumber = idnumber;
    }

        public Patient(String name, String surename, String idnumber) {
        this.name = name;
        this.surename = surename;
        this.idnumber = idnumber;
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
    public String getIdnumber() {
        return idnumber;
    }
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }
}