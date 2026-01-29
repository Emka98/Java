import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {
    
    public Integer[] removeEven(Integer[] tab){
 
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Integer[] withremovedEvenold = new Integer[tab.length];

        for(int i = 0; tab.length > i; i++){
            if(!isEven.test(tab[i])){
                withremovedEvenold[i] = tab[i];
            }
        }
       return withremovedEvenold; 
    }
    
    public static void main(String[] args) {
        App app = new App();
        
        Supplier<Integer[]> randomNumbersTab = () -> {
            Integer[] tabnumbers = new Integer[10];
            for(int i = 0; i < tabnumbers.length; i++){
                tabnumbers[i] = new Random().nextInt(100);
            }
            return tabnumbers;           
        };

        Consumer<Integer[] > printer = s -> {
            for (Integer number : s){
                if(number != null){
                    System.out.print(number + " ");
                }
        
            }
        };    
        
        randomNumbersTab.get();
        printer.accept(app.removeEven(randomNumbersTab.get()));
    }
}
