import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


// https://www.javatpoint.com/java-bufferedoutputstream-class
public class BufferedOutputStream_app {

    public static void main(String[] args) {

        try {

            FileOutputStream fout = new FileOutputStream("R:\\MyFile.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fout);

            String str = "Using BufferedOutputStream class for writing this.";
            byte[] b = str.getBytes();

            bos.write(b);

            bos.flush();
            bos.close();
            fout.close();

            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
