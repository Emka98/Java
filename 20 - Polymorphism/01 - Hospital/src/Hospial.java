class Hospial {

    int workerNumbers = 0;
    private Person [] hospial = new Person[3];

    public void addPerson(Person person){
        hospial[workerNumbers] = person;
        workerNumbers = workerNumbers + 1;
    }

    void getInfo(){
        for(Person person: hospial){
            System.out.println(person.getInfo());
        }
    }
}
