package It.com.project.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Main_train {

	public static void main(String[] args) {
		Depo depo = new Depo();
		depo.add(new Train("Minsk", 251, new Date(2022-1900, 1, 1, 15, 56)));
		depo.add(new Train("Minsk", 200, new Date(2022-1900,1,22,22,1)));
		depo.add(new Train("Wroclaw", 51, new Date(2022-1900, 1, 1, 15, 56)));
		depo.add(new Train("Riga", 77, new Date(2022-1900,1,22,22,1)));

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

		depo.sortByTrainNumber();
		depo.printTrains();

	}

}
