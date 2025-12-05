import java.util.Arrays;

class PersonDatabase {

    private Person[] data = new Person[1];
    private int numerPerons = 0;

    public void add(Person p) throws NullPointerException{
        if (numerPerons >= data.length){
            // Double the array size when full
            data = Arrays.copyOf(data, data.length * 2);
        }

        data[numerPerons] = p;
        numerPerons++;
    }

    public void remove(Person p){
        for (int i = 0; i <= data.length-1; i++) {
            if(data[i] != null){
                if (data[i].equals(p)){
                    data[i] = null;
                    numerPerons--;
                }
            }
        }
    }

    public void showData() {
        for (Person p : data) {
            System.out.println(p);
        }
    }

    public Person get(int index){
        return data[index];
    }

    public int size(){
        return numerPerons; 
    }






}
