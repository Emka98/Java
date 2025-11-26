import java.math.BigInteger;

public class App {
    public static void main(String[] args) throws Exception {
        
        String fileName = "numbers.txt";
        writerReaderCreator wrc = new writerReaderCreator();

        wrc.creatorFile(fileName);
        
        BigInteger[] tab = wrc.reader(fileName);

        BigInteger sumOf3First = tab[0].add(tab[1].add(tab[2]));
        System.out.println(sumOf3First);
        
        BigInteger quotient = tab[4].divide(tab[3]);
        System.out.println(quotient);




        
        




        
    }
}
