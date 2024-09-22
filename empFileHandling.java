import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

 class Employee implements Serializable {

	int empid;
	String name;
	float sal;

	Employee() {
		System.out.println("default ");
		Scanner s = new Scanner(System.in);
		empid = s.nextInt();
		name = s.next();
		sal = s.nextFloat();
		s.close();
	}

	Employee(int id, String na, float sa) {
		
		empid = id;
		
		name = na;
		sal = sa;

	}

	void displayEmployee() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(sal);
		System.out.println();
	}

}
public class empFileHandling {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//write
		
		Employee e1 = new Employee(101,"JAN ", 30000);
		Employee e2 = new Employee(103,"sAN ", 40000);
		
		Employee e3 = new Employee(102,"MAN ", 50000);
		
		FileOutputStream fs = new FileOutputStream("emp");
		ObjectOutputStream oos = new ObjectOutputStream(fs);
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		
		oos.close();
		
		
		FileInputStream fis = new FileInputStream("emp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Employee e;
        try {
        while(true) {
        	e =(Employee) ois.readObject();
        	e.displayEmployee();
        }
        }catch(EOFException ex) {
        	System.out.println("emp read is over");
        }
        fis.close();
        ois.close();

	}
        

}
