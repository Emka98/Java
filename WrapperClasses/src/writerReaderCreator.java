import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

class writerReaderCreator{

    public void creatorFile(String fileName) throws IOException{
        File file = new File(fileName);
        file.createNewFile();
        String text =   """
            123
            1234
            12345
            123456789123456789
            987654321987654321""";
        writer(fileName, text); 
    }

    public BigInteger[] reader(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        int lines = 0;
    
        try(Scanner scan = new Scanner(file)){
            while (scan.hasNextBigInteger()) {
                scan.nextBigInteger();
                lines ++;
            }
        }

        BigInteger[] tabBigInteger = new BigInteger[lines];
        lines = 0; 

        try(Scanner scan = new Scanner(file)){
            while (scan.hasNextBigInteger()) {
                tabBigInteger[lines] = scan.nextBigInteger();
                lines++;
            }
        }
        return tabBigInteger; 
    }

    public void writer(String fileName, String text)throws IOException{
        var fileWriter = new FileWriter(fileName);
        try(var writer = new BufferedWriter(fileWriter)){
            writer.write(text);
        };
    }
}
