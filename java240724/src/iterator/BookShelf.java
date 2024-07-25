package iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BookShelf implements Iterable<Book>{
	
	private Book[] books;
	private int last = 0;
	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}
	
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appenBook(Book book) {
		this.books[last] = book;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	

	

}
