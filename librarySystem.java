import java.util.*;

class Library {
    
    int memberList;
    String title;
    String bookList;
    String author;
   

    // Method to read book details
    void readBook(String title, String author) {
        this.title = title;
        this.author = author;
        
}
    void search(int str ) {
        
        if (Str[i]==key) {
             // Applying a 30% discount for books above 799
        }
        System.out.println("DISCOUNT: " + discount + "%");
        System.out.println("FINAL PRICE: " + (price - (price * discount / 100)));
    }
    
    void display() {
        System.out.println("TITLE: " + title);
        System.out.println("AUTHOR: " + author);
        
        System.out.println("BOOK NO: " + memberList);
    }
}

public class librarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int ch = s.next().charAt(0);
		Library b1 = new Library();
        b1.readBook("BBT", "SHELDON");
        b1.display();
        b1.search(ch);
        
       

        System.out.println(); // Line break

        Library b2 = new Library();
        b2.readBook("The Internship", "John");
        b2.display();
        b2.search(ch);

        System.out.println(); // Line break

        Library b3 = new Library();
        b3.readBook("Dinosaur", "ROSS");
        b3.display();
        b3.search(ch);

        System.out.println(); // Line break

        Library b4 = new Library();
        b4.readBook("Narnia", "C.S. Lewis");
        b4.display();
        b4.search(ch);
	}

}
