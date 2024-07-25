package iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4); // 생자에 4가 들어가는 거임(Bookshelf)
		bookShelf.appenBook(new Book("Around the World in 80 Days"));
		bookShelf.appenBook(new Book("Bible"));
		bookShelf.appenBook(new Book("Cinderella"));
		bookShelf.appenBook(new Book("삼국지"));
		
		Iterator<Book> it =bookShelf.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();
		
		for (Book book: bookShelf) {
			System.out.println(book.getName());
		}
		System.out.println();

	}

}
