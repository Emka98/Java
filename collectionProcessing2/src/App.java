import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

class App{
    public static void main(String[] args) throws FileNotFoundException {
        
        String fileName = "loremipsum-129.txt";
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        String text = "";

        while(sc.hasNextLine()){
            text += sc.nextLine();
        }

        List<String> listWords = List.of(text.split(" "));

        List<String> listWordsWithOutPredicate = listWords.stream()
                                                    .map(x -> x.replaceAll("[.,]", ""))
                                                    .toList();

        long numberOfSWords = listWordsWithOutPredicate.stream()
                                                    .filter(x -> x.charAt(0) == 's')
                                                    .count();

        long numberOf5WordsLegth = listWordsWithOutPredicate.stream()
                                                .filter(x -> x.length() == 5)
                                                .count();
        
        System.out.println("Numbers of words starts s: " + numberOfSWords);
        System.out.println("Numbers of worts with long 5 chars: " + numberOf5WordsLegth);
        System.out.println("List of words: ");
        listWordsWithOutPredicate.forEach(System.out::println);



  }
}