package Assignments;

/*
 * Create a file named the Numbers and populate it with 30 random numbers
 *  in the range 1 to 30 including the end points. Place 1 number per line.
 *  Open the file and print the numbers 10 per line. Find and print the following.
 *   1. Average of the numbers 2. Sum of the numbers
 */

import java.io.*;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Assignment_app2 {

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Numbers.txt"))) {

            Random random = new Random();

            for (int i = 1; i <= 30; i++) {

                int n = random.nextInt(30);

                if (i != 30) {

                    writer.write(n + "\n");
                } else {

                    writer.write(Integer.toString(n));
                }
            }

            writer.flush();

            BufferedReader reader = new BufferedReader(new FileReader("Numbers.txt"));

            // reader.lines() -> returns a stream object
            List<Integer> numbers = reader.lines().map(Integer::parseInt).collect(Collectors.toList());

            numbers.forEach(x -> System.out.print(x + " "));

            // finding average

            int sum = numbers.stream().reduce(0, Integer::sum);

            System.out.println("\nAverage of the numbers is : " + (double) sum / numbers.size());
            System.out.println("Sum of the numbers is : " + sum);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
