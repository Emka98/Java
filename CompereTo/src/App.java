import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        
        Integer[] tabInt = {4,3,2,1,5,6,7,8,9,20,19,18,17,16,15,11,10,12,13,14};

        Arrays.sort(tabInt, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); 
            }
        });

        System.out.println(Arrays.toString(tabInt));

        Arrays.sort(tabInt, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); 
            }
        });

        System.out.println(Arrays.toString(tabInt));
    }
}
