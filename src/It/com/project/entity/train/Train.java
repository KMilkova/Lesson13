package It.com.project.entity.train;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Train {

	private String pointOfDeparture;
	private int trainNumber;
	private Date time;

	public Train() {
		super();
	}

	public Train(String pointOfDeparture, int trainNumber, Date time) {
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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
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
		SimpleDateFormat f = new SimpleDateFormat("HH:mm");
		return "Train [pointOfDeparture=" + pointOfDeparture + ", trainNumber=" + trainNumber + ", time=" + f.format(time) + "]";
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
