//QUESTION 1 BOOK MANAGEMENT

class Books {
    String title;
    String author;
    int price;
    int bookNo;

    // Method to read book details
    void readBook(String title, String author, int price, int bookNo) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookNo = bookNo;
    }

    // Method to display book details
    void display() {
        System.out.println("TITLE: " + title);
        System.out.println("AUTHOR: " + author);
        System.out.println("PRICE: " + price);
        System.out.println("BOOK NO: " + bookNo);
    }

    // Method to apply discount based on the price
    void discount() {
        int discount = 0;
        if (price >=799) {
            discount = 30;  // Applying a 30% discount for books above 799
        }
        System.out.println("DISCOUNT: " + discount + "%");
        System.out.println("FINAL PRICE: " + (price - (price * discount / 100)));
    }
}

public class BookManagement {
    public static void main(String[] args) {
        // Creating and managing different book instances
        Books b1 = new Books();
        b1.readBook("BBT", "SHELDON", 999, 1001);
        b1.display();
        b1.discount();

        System.out.println(); // Line break

        Books b2 = new Books();
        b2.readBook("The Internship", "John", 799, 1002);
        b2.display();
        b2.discount();

        System.out.println(); // Line break

        Books b3 = new Books();
        b3.readBook("Dinosaur", "ROSS", 699, 1003);
        b3.display();
        b3.discount();

        System.out.println(); // Line break

        Books b4 = new Books();
        b4.readBook("Narnia", "C.S. Lewis", 799, 1004);
        b4.display();
        b4.discount();
    }
}
