public class App {
    public static void main(String[] args) throws Exception {

        Person per1 = new Person("Emil", "Guli", "98");
        Person per2 = new Person("Emil", "Guli", "98");
        Person per3 = new Person("Emil", "Guli", "98");
        

        PersonDatabase data1 = new PersonDatabase();
        
        data1.add(per1);
        data1.add(per2);
        data1.add(per3);
        

        data1.showData();
        System.out.println(data1.size());      
    }
}
