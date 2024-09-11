
public class LibraryOverloading {
	
	public void addbook(String title,String author) {
		System.out.println("the book title : "+"vincezo "+" "+"BookAuthor:"+"mary");
		
	}
	public void addbook(String title,String author,int year) {
		System.out.println("the book title : "+"vincezo "+" "+"BookAuthor:"+"mary  "+"year of publish :" +2024 );
		
	}
	public void addbook(String title,String author,int year, String genre) {
		System.out.println("the book title : "+"vincezo "+" "+"BookAuthor: "+"mary  "+"year of publish :"+2024 + "  Genre: " +" horror");
	
}

	public static void main(String[] args) {
		LibraryOverloading lo = new LibraryOverloading();
		lo.addbook(null, null);
		
		lo.addbook(null, null ,0);
		lo.addbook(null, null ,0 ,null);
	}

}
