package It.com.project.entity.book;

import java.util.ArrayList;
import java.util.List;

public class Main_book {

	public static void main(String[] args) {
		Books books = new Books();
		books.add(new Book(1, "Book1", new String[] { "Kev", "Den" }, "Bubble", 2001, 125, 22, "Type1"));
		books.add(new Book(2, "Book2", new String[] { "Kev" }, "Candy", 2022, 225, 32, "Type2"));
		books.add(new Book(3, "Book3", new String[] { "Den" }, "Bubble", 2008, 85, 20, "Type1"));

		books.print();
		System.out.println();

		books.findABooksByAuthor("Kev");
		System.out.println();

		books.findABooksByPublishingHouse("Candy");
		System.out.println();

		books.findABooksIssuedAfterAYear(2008);
		System.out.println();

	}

}
