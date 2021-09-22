import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// https://www.javatpoint.com/java-fileoutputstream-class
public class FileOutputStream_app {

    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("R:\\MyFile.txt");

            //fout.write(65); // this will write the character A

            // writing String to a file

            String str = "This is a test file";
            byte[] b = str.getBytes();

            fout.write(b);

            fout.close();
            System.out.println("Success");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
