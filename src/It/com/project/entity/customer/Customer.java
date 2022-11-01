package It.com.project.entity.customer;

//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 

public class Customer {
	private int ind;
	private String surname;
	private String name;
	private String middleName;
	private String address;
	private long creditCardNumber;
	private String bankAccountNumber;

	public Customer() {
		super();
	}

	public Customer(int ind, String surname, String name, String middleName, String address, long creditCardNumber,
			String bankAccountNumber) {
		this.ind = ind;
		this.surname = surname;
		this.name = name;
		this.middleName = middleName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public void setInd(int ind) {
		this.ind = ind;
	}

	public int getInd() {
		return ind;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "id = " + ind + ", surname = " + surname + ", name = " + name + ", middleName = " + middleName
				+ ", address = " + address + ", creditCardNumber = " + creditCardNumber + ", bankAccountNumber = "
				+ bankAccountNumber;
	}

}
