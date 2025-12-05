class Person {

    private String name;
    private String surename;
    private String pesel;

    public Person(String name, String surename, String pesel){

        this.name = name;
        this.surename = surename;
        this.pesel = pesel;
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    
        @Override
    public boolean equals(Object obj) {
        //Validate Object
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        //Validate name
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        //Validate surename
        if (surename == null) {
            if (other.surename != null)
                return false;
        } else if (!surename.equals(other.surename))
            return false;
        //Validate pesel
        if (pesel == null) {
            if (other.pesel != null)
                return false;
        } else if (!pesel.equals(other.pesel))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surename == null) ? 0 : surename.hashCode());
        result = prime * result + ((pesel == null) ? 0 : pesel.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Surename: %s Pesel: %s", name, surename, pesel);
    }
}
