package It.com.project.entity.book;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private int id;
	private String name;
	private String[] authors;
	private String publishingHouse;
	private int year;
	private int count;
	private int price;
	private String bindingType;

	public Book() {
		super();
	}

	public Book(int id, String name,String[] authors, String publishingHouse, int year, int count, int price,
			String bindingType) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.year = year;
		this.count = count;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		String aut = "";
		for(String author:authors) {
			aut = aut + author +", ";
		}
		return "id=" + id + ", name=" + name + ", authors=" + aut + " publishingHouse = " + publishingHouse
				+ ", year=" + year + ", count=" + count + ", price=" + price + ", bindingType=" + bindingType;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(authors);
		result = prime * result + Objects.hash(bindingType, count, id, name, price, publishingHouse, year);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Arrays.equals(authors, other.authors) && Objects.equals(bindingType, other.bindingType)
				&& count == other.count && id == other.id && Objects.equals(name, other.name) && price == other.price
				&& Objects.equals(publishingHouse, other.publishingHouse) && year == other.year;
	}

}
