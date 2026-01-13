import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lotto {
    
    List<Integer> list = new LinkedList<>();

    public List<Integer> generate(){
        for (int i = 0;  i <= 49; i++){
            list.add(i);
        }
        return list;
    };

    public List<Integer> randomize(){
        Collections.shuffle(list);
        return list;
    }

    public int checkResult(List<Integer> numbers){
        int good = 0;
        for(int i = 0; i <= 5; i++){
            if(numbers.get(i) == list.get(i)){
                good ++; 
            } 
        }
        return good;
    }

    
}