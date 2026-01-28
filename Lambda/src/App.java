import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        
        Supplier<Integer[]> randomNumbersTab = () -> {
            Integer[] tabnumbers = new Integer[10];
            for(int i = 0; i < tabnumbers.length; i++){
                tabnumbers[i] = new Random().nextInt(100);
            }
            return tabnumbers;           
        };

        Consumer<Integer[] > printer = s -> {
            for (Integer number : s){
                System.out.print(number + " ");
            }
        };

        Predicate<Integer> isEven = x -> x % 2 == 0;
        
        public void 

        

    }
}
