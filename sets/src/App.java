import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        String fileName = "namespl.txt";
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        TreeSet<String> names = new TreeSet<>(Collections.reverseOrder());

        while(scan.hasNextLine()){
            String name = scan.nextLine();
            names.add(name);
        }

        System.out.println(names);
        System.out.println(names.size());
    }
}
