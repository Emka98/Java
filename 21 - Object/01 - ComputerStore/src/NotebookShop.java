public class NotebookShop {
    public static void main(String[] args) {
        
        Computer comp1 = new Computer("Lenovo", 1);
        Computer comp2 = new Computer("Lenovo", 2);
        Computer comp3 = new Computer("Lenovo", 3);
        Computer comp4= new Computer("Lenovo", 4);
        Computer comp5= new Computer("Lenovo", 5);
        Computer comp6= new Computer("Lenovo", 1);

        DataStore datastore1 = new DataStore();
        
        datastore1.add(comp1);
        datastore1.add(comp2);
        datastore1.add(comp3);
        datastore1.add(comp4);
        datastore1.add(comp5);
        datastore1.add(comp6);

        datastore1.ability(comp3);

    }

}
