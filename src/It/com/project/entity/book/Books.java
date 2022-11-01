package It.com.project.entity.book;

import java.util.ArrayList;
import java.util.List;

public class Books {
	private List<Book> books = new ArrayList<Book>();

	public Books() {
	}

	public Books(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void add(Book book) {
		books.add(book);
	}
	
	public void print() {
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
	
	public void delete(int ind) {
		if (ind > 0 && ind <= books.size()) {
			books.remove(ind - 1);
		}
	}

	public void findABooksByAuthor(String author) {
		for (Book book : books) {
			for (String authors : book.getAuthors()) {
				if (authors == author) {
					System.out.println(book.toString());
				}
			}
		}
	}

	public void findABooksByPublishingHouse(String publishingHouse) {
		for (Book book : books) {
			if (book.getPublishingHouse() == publishingHouse) {
				System.out.println(book.toString());
			}

		}
	}
	
	public void findABooksIssuedAfterAYear(int year) {
		for (Book book : books) {
			if (book.getYear() > year) {
				System.out.println(book.toString());
			}

		}
	}

}

//Найти и вывести: 
//a) список книг заданного автора; 
//b) список книг, выпущенных заданным издательством; 
//c) список книг, выпущенных после заданного года.
