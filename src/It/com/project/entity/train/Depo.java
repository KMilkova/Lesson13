package It.com.project.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Depo {

	private List<Train> trains = new ArrayList<Train>();

	public Depo() {
		super();
	}

	public Depo(List<Train> trains) {
		this.trains = trains;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}

	public void add(Train train) {
		trains.add(train);
	}

	public void sortByPointOfDeparture() {
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

	public void sortByTrainNumber() {
		Collections.sort(trains, new Comparator<Train>() {
			@Override
			public int compare(Train tr1, Train tr2) {
				return tr1.getTrainNumber() - tr2.getTrainNumber();
			}
		});
	}

	public void printTrains() {
		for (Train tr : trains) {
			System.out.println(tr.toString());
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Depo [trains=" + trains + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(trains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depo other = (Depo) obj;
		return Objects.equals(trains, other.trains);
	}

}
