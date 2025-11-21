import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class WriteAndReadToFile {

    void ObjectWriter(String fileName, Company company){ 

        try(
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs);
        ) {
            os.writeObject(company);
            System.out.println("Zapisano obiekt do pliku");
        } catch (IOException e) {
            System.err.println("Bład zapisu pliku " + fileName);
            e.printStackTrace();
        }
    }

    Company ObjectReader(String fileName){
        
        Company company = null;

        try (
            var fis = new FileInputStream(fileName);
            var ois = new ObjectInputStream(fis);
        ) {
            company = (Company) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Nie udało się odczytać pliku");
            e.printStackTrace();
        }

        if (company != null) {
            System.out.println("Wczytano dane o firmie:");
        }
        
        return company;
    }
}