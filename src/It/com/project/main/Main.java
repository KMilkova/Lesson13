package It.com.project.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Main_train {

	public static void main(String[] args) {
		Depo depo = new Depo();
		depo.add(new Train("Minsk", 251, "12:00"));
		depo.add(new Train("Minsk", 200, "11:20"));
		depo.add(new Train("Wroclaw", 51, "02:10"));
		depo.add(new Train("Riga", 77, "15:00"));

		int trainNumber = 251;
		for (Train tr : depo.getTrains()) {
			if (tr.isThisNumber(trainNumber)) {
				System.out.println(tr.toString());
			}
		}

		System.out.println();
		depo.printTrains();

		depo.sortByPointOfDeparture();
		depo.printTrains();

		depo.sortByPointOfDeparture();
		depo.printTrains();

	}

}
