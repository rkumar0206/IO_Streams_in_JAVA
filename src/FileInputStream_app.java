import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// https://www.javatpoint.com/java-fileinputstream-class
public class FileInputStream_app {
    public static void main(String[] args) {

        try {

            FileInputStream fin = new FileInputStream("R:\\MyFile.txt");

            // will read the first character in int and convert it to char
            //System.out.println((char) fin.read());

            // printing the whole text

            int i;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }

            fin.close();

        } catch (IOException e) {

            System.out.println("Fail");
            e.printStackTrace();
        }
    }
}
