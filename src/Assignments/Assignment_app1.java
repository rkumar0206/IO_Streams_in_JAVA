package Assignments;
/*
        Write a program which copies content of one file to a new file
        by removing unnecessarily spaces between them
 */

import java.io.*;

public class Assignment_app1 {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("file1.txt"))) {

            BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"));

            String str = "";

            while ((str = reader.readLine()) != null) {

                String s = str.replaceAll("\\s+", " ");

                writer.write(s + "\n");

            }

            System.out.println("File copied successfully");

            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
