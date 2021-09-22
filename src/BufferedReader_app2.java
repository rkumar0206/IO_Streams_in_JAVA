import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_app2 {

    public static void main(String[] args) {

        // we are reading and printing the data until the user prints stop.

        try {
            InputStreamReader reader = new InputStreamReader(System.in);

            BufferedReader bufferedReader = new BufferedReader(reader);

            String name = "";

            while (!name.equals("stop")) {

                System.out.println("Enter your name : ");
                name = bufferedReader.readLine();
                System.out.println("Data is : " + name);
            }

            bufferedReader.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
