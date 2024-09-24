import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person implements Serializable {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        super();
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Name: " + name + "  Age: " + age + "  Email: " + email;
    }
}

class FileManagee {

    void writePersons(List<Person> p, String fileName) throws IOException {
        if (p == null || p.isEmpty()) {
            // Create a new list if it's null or empty
            p = new ArrayList<>();
            Person p1 = new Person("jan", 23, "fghj");
            Person p2 = new Person("man", 43, "erfgh");
            Person p3 = new Person("san", 29, "dfvb");

            p.add(p1);
            p.add(p2);
            p.add(p3);
        }
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(p);
            System.out.println("Persons saved successfully.");
        }
    }

    @SuppressWarnings("unchecked")
    List<Person> displayPersons(String fileName) throws IOException, ClassNotFoundException {
        List<Person> p;
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            p = (List<Person>) ois.readObject();
            System.out.println("Reading and displaying objects from file manager:");
            for (Person pp : p) {
                System.out.println(pp.toString());  // Print individual person
            }
        }
        return p;
    }

    @SuppressWarnings("unchecked")
    static List<Person> readPersons(String fileName) throws IOException, ClassNotFoundException {
        List<Person> p;
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
        	
            p = (List<Person>) ois.readObject();
            System.out.println("Reading and displaying objects from file manager:");
            for (Person pp : p) {
                System.out.println(pp.toString());  // Print individual person
            }
        }
        return p;
    }

    Person searchPersonByName(List<Person> p, String str) {
        if (p == null) {
            System.out.println("Invalid list");
            return null;
        }

        // Loop through the list to find the person by name
        for (Person pp : p) {
            if (pp.getName().equalsIgnoreCase(str)) {  // Using equalsIgnoreCase for case-insensitive comparison
                System.out.println("Person found: " + pp.toString());
                return pp; // Return the matching person
            }
        }

        System.out.println("Person not found");
        return null;  // Return null if no match is found
    }
}

public class ObjectFileManageFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileManagee fm = new FileManagee();
        String filename = "file_manage.ser";
        List<Person> p = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice:");
        System.out.println("1. Write Persons");
        System.out.println("2. Display Persons");
        System.out.println("3. Search Person by Name");
        System.out.println("4. Load Persons from File");

        while (true) {
            int ch = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (ch) {
                case 1:
                    fm.writePersons(p, filename);
                    break;

                case 2:
                    List<Person> persons = fm.displayPersons(filename);
                    break;

                case 3:
                    System.out.println("Search for a person by name:");
                    String str = sc.nextLine();  // Read the input name to search for
                    List<Person> searchList = fm.displayPersons(filename);
                    Person foundPerson = fm.searchPersonByName(searchList, str);
                    if (foundPerson != null) {
                        System.out.println("Found person: " + foundPerson.toString());  // Output the person details
                    } else {
                        System.out.println("No person found with the given name.");
                    }
                    break;

                case 4:
                    System.out.print("Enter file name to load: ");
                    String loadFileName = sc.nextLine();
                    List<Person> loadedPersons = FileManagee.readPersons(loadFileName);
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }
            System.out.println("Enter choice (1-4):");
        }
    }
}
