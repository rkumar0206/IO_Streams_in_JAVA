import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_app {

    public static void main(String[] args) {

        try {

            FileReader fileReader = new FileReader("R:\\MyFile.txt");

            int i;
            while ((i = fileReader.read()) != -1) {

                System.out.print((char) i);
            }

            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
