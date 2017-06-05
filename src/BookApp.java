import java.util.ArrayList;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> books = new ArrayList<Book>();
		Book b = new Book();
		b.setTitle("Calvin and Hobbes");
		b.setAuthor("Bill Waterson");
		b.setDescription("Children's Comic Book Series");
		b.setPrice(5.95);
		books.add(b);

		Book c = new Book();
		c.setTitle("Charlie Brown");
		c.setAuthor("Charles M. Schultz");
		c.setDescription("Children's Comic Book Series");
		c.setPrice(12.95);
		books.add(c);
		for(Book book:books){
			System.out.print(book);
		}

	}
}