import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Map <String,Person> persons = new TreeMap<>();

        persons.put("Gulinski", new Person("Emil", "Gulinski", 20));
        persons.put("Głąbek", new Person("Kamil", "Głąbek", 90));
        persons.put("Cokichał", new Person("Michał", "Cokichał", 50));

        Collection <Person> values = persons.values();
        Iterator<Person> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
