//QUESTION 3 STUDENT GRADING SYSYTEM
import java.util.Scanner;

class Student {
    
    String sname;
    int rollno;
    int java;
    int spring;
    int react;
    int node;
    int total;
    int avgg;


    // Method to read bank account details
    void readMarks() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name: ");
        sname = s.nextLine();
        System.out.print("Enter rollno: ");
        rollno = s.nextInt();
        System.out.print("Enter Java: ");
        java = s.nextInt();
        System.out.print("Enter spring: ");
        spring = s.nextInt();
        System.out.print("Enter react: ");
        react = s.nextInt();
        System.out.print("Enter node: ");
        node = s.nextInt();
        System.out.println(" ");
        s.close();
    }
    void displayBalance() {
    	
    	total = (java + spring + react + node);
    	System.out.println("total:"+ total);
    	avgg = total/4;
    	
    	if (avgg >= 90 && avgg <= 100) {
            System.out.println("Grade: A");
        } else if (avgg >= 80 && avgg < 90) {
            System.out.println("Grade: B");
        } else if (avgg >= 70 && avgg < 80) {
            System.out.println("Grade: C");
        } else if (avgg >= 60 && avgg < 70) {
            System.out.println("Grade: D");
        } else if (avgg >= 50 && avgg < 60) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
    }

   
    

    // Method to display bank account details
    void display() {
        System.out.println("NAME: " + sname);
        System.out.println("Roll no: " + rollno);
        System.out.println("java: " + java);
        System.out.println("spring: " + spring);
        System.out.println("react: " + react);
        System.out.println("node: " + node);
        
    }
}

public class studentGrade {
    public static void main(String[] args) {
        // Creating a new Bank object
       Student b1 = new Student();
        b1.readMarks();
        b1.display();
        b1.displayBalance();
    }
}
