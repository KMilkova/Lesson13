package It.com.project.entity.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Main_train {

	public static void main(String[] args) {
		List<Train> trains = new ArrayList<Train>();
		trains.add(new Train("Minsk", 251, "12:00"));
		trains.add(new Train("Minsk", 200, "11:20"));
		trains.add(new Train("Wroclaw", 51, "02:10"));
		trains.add(new Train("Riga", 77, "15:00"));

		int trainNumber = 251;
		for (Train tr : trains) {
			if (tr.isThisNumber(trainNumber)) {
				System.out.println(tr.toString());
			}
		}
		
		System.out.println();
		printTrains(trains);


		sortByPointOfDeparture(trains);
		printTrains(trains);

		sortByPointOfDeparture(trains);
		printTrains(trains);


	}

	public static void sortByPointOfDeparture(List<Train> trains) {
		Collections.sort(trains, new Comparator<Train>() {
			@Override
			public int compare(Train tr1, Train tr2) {
				if (tr1.getPointOfDeparture() == tr2.getPointOfDeparture()) {
					return tr1.getTime().compareTo(tr2.getTime());
				} else {
					return tr1.getPointOfDeparture().compareTo(tr2.getPointOfDeparture());
				}
			}
		});
	}

	public static void sortByTrainNumber(List<Train> trains) {
		Collections.sort(trains, new Comparator<Train>() {
			@Override
			public int compare(Train tr1, Train tr2) {
				return tr1.getTrainNumber() - tr2.getTrainNumber();
			}
		});
	}

	public static void printTrains(List<Train> trains) {
		for (Train tr : trains) {
			System.out.println(tr.toString());
		}
		System.out.println();
	}

}
