import java.util.*;

public class mainApp {
    public static void main(String[] args) {
     
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Jagna", "Kasia", "Kamila", "Roksana", "Zuzia");
        Collections.sort(names, String::compareToIgnoreCase);
        names.forEach(System.out::println);
    }
}
