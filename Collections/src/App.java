import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Lotto lotto1 = new Lotto();
        
        List<Integer> losowanie = new LinkedList<>();
        losowanie.add(1);
        losowanie.add(2);
        losowanie.add(3);
        losowanie.add(4);
        losowanie.add(5);
        losowanie.add(6);

        System.out.println(lotto1.generate());
        System.out.println(lotto1.randomize());
        System.out.println(lotto1.checkResult(losowanie));
    }
}
