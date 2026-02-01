import java.util.stream.IntStream;

public class Course {
    public static void main(String[] args) {
        
        IntStream stream = IntStream.of(105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200);
        stream.filter(x -> x > 100 && x < 1000 && x % 5 == 0 )
        .limit(10)
        .map(x -> x *3)
        .forEach(System.out::println)
        ;
    }
}