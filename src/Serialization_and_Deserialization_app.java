import java.io.*;

// https://www.javatpoint.com/serialization-in-java
public class Serialization_and_Deserialization_app {

    public static void main(String[] args) {


        try {

            // Serializing
            Student s1 = new Student("Rohit", 20750282);

            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);

            objectOutputStream.writeObject(s1);

            objectOutputStream.flush();
            objectOutputStream.close();

            System.out.println("Success");


            // Deserialization

            System.out.println("Deserialization....");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("f.txt"));

            Student s = (Student) objectInputStream.readObject();
            System.out.println("Student name : " + s.name + " " + "Student Id : " + s.id);

            objectInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

/**
 * Some important points -
 *
 * 1. Each and every object of a class must implement Serializable interface
 * in order to be serialized
 *
 * 2. If a class implements Serializable interface then all its sub classes will also be serializable.
 *
 * 3. If there is any static data member in a class, it will not be serialized
 * because static is the part of class not object.
 *
 * 4. In case of array or collection, all the objects of array or collection
 * must be serializable. If any object is not serializable, serialization will be failed.
 *
 * 5. If you don't want to serialize any data member of a class, you can mark it as transient
 * with transient keyword ex : transient int id.
 */

class Student implements Serializable {

    String name;
    int id;

    Student(String name, int id) {

        this.name = name;
        this.id = id;
    }
}