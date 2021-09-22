
// Java BufferedWriter class is used to provide buffering
// for Writer instances. It makes the performance fast.
// It inherits Writer class. The buffering characters are used
// for providing the efficient writing of single arrays, characters, and strings.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// https://www.javatpoint.com/java-bufferedwriter-class
public class BufferedWriter_app {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("R:\\MyFile.txt");

            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("This string has been written by using the BufferedWriter class.");
            bufferedWriter.newLine();
            bufferedWriter.write(new char[] {'a', 'b', 'c'});

            bufferedWriter.flush();
            bufferedWriter.close();
            writer.close();

            System.out.println("Success");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
