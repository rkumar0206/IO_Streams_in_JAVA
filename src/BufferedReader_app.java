import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// https://www.javatpoint.com/java-bufferedreader-class

public class BufferedReader_app {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("R:\\MyFile.txt");

            BufferedReader bufferedReader = new BufferedReader(reader);

            //using read() method
//        int i;
//        while ((i = bufferedReader.read()) != -1) {
//
//            System.out.print((char)i);
//        }

            // using readLine() Method

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                System.out.println(line);
            }

            bufferedReader.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
