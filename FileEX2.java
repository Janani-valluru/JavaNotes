import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;
    int roll;

    public Student(int id, String name, int roll) {
        super();
        this.id = id;
        this.name = name;
        this.roll = roll;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Roll: " + roll);
    }
}

public class FileEX2 {

    public static void main(String[] args) {
        try {
            // Creating Student objects
            Student s1 = new Student(10, "jan", 23);
            Student s2 = new Student(11, "san", 33);
            Student s3 = new Student(12, "man", 43);

            // Writing the objects to the file using serialization
            FileOutputStream fos = new FileOutputStream("dac1");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);
            System.out.println("Student objects have been written to dac1.");

            // Closing the output streams
            oos.close();
            fos.close();

            // Reading the objects from the file using deserialization
            FileInputStream fis = new FileInputStream("dac1");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s11 = (Student) ois.readObject();
            Student s12 = (Student) ois.readObject();
            Student s13 = (Student) ois.readObject();

            // Displaying the deserialized objects' data
            System.out.println("Reading and displaying objects from dac1:");
            s11.display();
            s12.display();
            s13.display();

            // Closing the input streams
            ois.close();
            fis.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
