import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

class Person implements Serializable
{
	String name;
	int age;
	String email;
	public Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	void display() {
		System.out.println("Name :"+ name+ "  age:" + age+"  email:"+ email);
	}
}

class FileManager{
	
	private Object name;
	void writePersons(List<Person> p, String fileName) throws IOException {
		
				Person p1 = new Person("jan",23,"fghj");
				Person p2 = new Person("man",43,"erfgh");
				Person p3 = new Person("san",29,"dfvb");
				
				FileOutputStream fos =  new FileOutputStream("file manage");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(p1);
				oos.writeObject(p2);
				oos.writeObject(p3);
				
				fos.close();
				oos.close();
		
	}
	
	void displayPersons(List<Person> persons) throws IOException, ClassNotFoundException {
		 FileInputStream fis = new FileInputStream("file manage");
         ObjectInputStream ois = new ObjectInputStream(fis);

         Person p1 = (Person) ois.readObject();
         Person p2 = (Person) ois.readObject();
         Person p3 = (Person) ois.readObject();

         // Displaying the deserialized objects' data
         System.out.println("Reading and displaying objects from file manager:");
         p1.display();
         p2.display();
         p3.display();
	}
	Person searchPersonByName(List<Person> p, String str) {
			
		for(Person pp : p) {
			 if (pp.name.equalsIgnoreCase((String) name)) {
	                return pp;  // Return the matching person
	            }
		}
		return null;
		
			
		}
	
}







public class ObjectFileManageFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileManager fm = new FileManager();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice");
		while(true) {
			int ch=sc.nextInt();
			switch(ch) {
			
			case 1: System.out.println("write");
					fm.writePersons(null, null);
					break;
			
			case 2:System.out.println("display");
					fm.displayPersons(null);
					break;
					
			case 3: System.out.println("serach"); 
			         String str = sc.next();
			         fm.searchPersonByName(null, str);
			
			
			
			}
		
		
		
	

	}

	}
}
