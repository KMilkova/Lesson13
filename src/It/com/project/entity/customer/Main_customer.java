package It.com.project.entity.customer;

public class Main_customer {

	public static void main(String[] args) {
		
		Customers customers = new Customers();
		customers.add(new Customer(1,"Victorov","Lev","Victorovich","Yakybova 11",5555666677778888L,"yt45626555545465"));
		customers.add(new Customer(2,"Petrov","Dima","Victorovich","Plekhanova 97",4444111122229999L,"tr45626777775465"));
		customers.add(new Customer(3,"Frost","Pavel","Victorovich","Yakybova 22",1111222233338888L,"pt45626555545465"));
		customers.add(new Customer(4,"Milkova","Tina","Victorova","Yakybova 39",3333666688887777L,"rt45626555545465"));

		customers.print();
		customers.delete(0);
		System.out.println();
		customers.print();
		
		customers.sortByAlphabet();
		System.out.println();
		customers.print();
		
		System.out.println();
		customers.printCustomersInDiapOfCreditCard(1111222233338888L,4444777788881111L);


	}

}
