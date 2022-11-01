package It.com.project.entity.customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Customers {
	private List<Customer> customers = new ArrayList<Customer>();

	public Customers() {
		super();
	}

	public Customers(List<Customer> customers) {
		this.customers = customers;
	}

	public void setCustomer(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> getCustomer() {
		return customers;
	}

	public void add(Customer customer) {
		customers.add(customer);
	}

	public void delete(int ind) {
		if (ind > 0 && ind <= customers.size()) {
			customers.remove(ind - 1);
		}
	}

	public void print() {
		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}
	}

	// a) список покупателей в алфавитном порядке;
	// b) список покупателей, у которых номер кредитной карточки находится в
	// заданном интервале

	public void sortByAlphabet() {// surname
		Collections.sort(customers, new Comparator<Customer>() {
			@Override
			public int compare(Customer c1, Customer c2) {
				return c1.getSurname().compareTo(c2.getSurname());
			}
		});
	}

	public void printCustomersInDiapOfCreditCard(long x, long y) {
		if (x <= y) {
			for (Customer c : customers) {
				if (c.getCreditCardNumber() >= x && c.getCreditCardNumber() <= y) {
					System.out.println(c.toString());
				}
			}
		}
	}
}
