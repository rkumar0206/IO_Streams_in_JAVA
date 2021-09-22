import java.io.*;

// https://www.javatpoint.com/java-bufferedinputstream-class
public class BufferedInputStream_app {

    public static void main(String[] args) {

        try {

            FileInputStream fin = new FileInputStream("R:\\MyFile.txt");

            BufferedInputStream bin = new BufferedInputStream(fin);

            int i;

            while ((i = bin.read()) != -1) {

                System.out.print((char) i);
            }

            bin.close();
            fin.close();

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
