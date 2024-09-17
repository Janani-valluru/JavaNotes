import java.util.ArrayList;
import java.util.List;

class Library {
    String name;
    String location;
    Book book;

    Library(String name, String location, Book book) {
        this.name = name;
        this.location = location;
        this.book = book;
    }

    void displayLib() {
        System.out.println("Library Name: " + name);
        System.out.println("Library Location: " + location);
        book.displayBook();
        System.out.println(" ");// Display details of the book in the library
    }
}

class Book {
    String title;
    String author;
    int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

public class LibraryRelation {

    public static void main(String[] args) {
        // Create a single book and associate it with the library
        Book bookInLibrary = new Book("Effective Java", "Joshua Bloch", 97801);
        Library library = new Library("Bloom Book House", "Church Street", bookInLibrary);
        library.displayLib();
        System.out.println(" ");

        // Create a list of books
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Pragmatic Programmer", "Andy Hunt", 9780));
        bookList.add(new Book("Clean Code", "Robert C. Martin", 97));
        bookList.add(new Book("Design Patterns", "Erich Gamma", 9780));


      
         for (int i = 0; i < bookList.size(); i++) {
         	Book b1 = bookList.get(i); 
          b1.displayBook();
             System.out.println();
         }
        
        }
    }


    

      
  