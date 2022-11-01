package It.com.project.entity.train;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Train {

	private String pointOfDeparture;
	private int trainNumber;
	private String time;

	public Train() {
		super();
	}

	public Train(String pointOfDeparture, int trainNumber, String time) {
		this.pointOfDeparture = pointOfDeparture;
		this.trainNumber = trainNumber;
		this.time = time;
	}

	public String getPointOfDeparture() {
		return pointOfDeparture;
	}

	public void setPointOfDeparture(String pointOfDeparture) {
		this.pointOfDeparture = pointOfDeparture;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public boolean isThisNumber(int trainNumber) {
		if (getTrainNumber() == trainNumber) {
			return true;
		}
		
		return false;
	}


	@Override
	public String toString() {
		return String.format("Point of departure: %s, train number: %d, departure time: %s", pointOfDeparture,
				trainNumber, time);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pointOfDeparture, time, trainNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(pointOfDeparture, other.pointOfDeparture) && Objects.equals(time, other.time)
				&& trainNumber == other.trainNumber;
	}

}
