import java.io.FileWriter;
import java.io.IOException;

// https://www.javatpoint.com/java-filewriter-class
public class FileWriter_app {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("R:\\MyFile.txt");

            writer.write("This is written using the FileWriter class.");
            writer.append("\nAppended string using FileWriter.append");

            writer.flush();
            writer.close();

            System.out.println("Success");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
