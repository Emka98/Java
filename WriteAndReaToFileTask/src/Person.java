import java.io.Serializable;

class Person implements Serializable {

    private String name;
    private String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name; 
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurename(){
        return this.name; 
    }
    public void setSurename(String surname){
        this.surname = surname;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " Surename: " + this.surname;
    }
}