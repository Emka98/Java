import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class App {

    public static void main(String[] args) throws IOException {
        
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Podaj mi swoje imię: ");
    String name = reader.readLine();
    System.out.println("Podaj mi miasto w którym mieszkasz: ");
    String city = reader.readLine();
    System.out.printf("Cześć %s, jak Ci się mieszka w %s", name, city);
    }
}