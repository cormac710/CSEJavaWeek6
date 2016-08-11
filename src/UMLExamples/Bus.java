package UMLExamples;

public class Bus {
	private int theNumberOfSeats;
	private static int theCount;
	private String theDriversName;
	private String theMake;

	public Bus() {
		this.theNumberOfSeats = 0;
		this.theDriversName = "";
		this.theDriversName = "";
		Bus.theCount++;
	}

	public Bus(int seats, String name, String make) {
		this.theNumberOfSeats = seats;
		this.theDriversName = name;
		this.theMake = make;
		Bus.theCount++;
	}

	public int getTheNumberOfSeats() {
		return theNumberOfSeats;
	}

	public void setTheNumberOfSeats(int theNumberOfSeats) {
		this.theNumberOfSeats = theNumberOfSeats;
	}

	public static int getTheCount() {
		return theCount;
	}

	public String getTheDriversName() {
		return theDriversName;
	}

	public void setTheDriversName(String theDriversName) {
		this.theDriversName = theDriversName;
	}

	public String getTheMake() {
		return theMake;
	}

	public void setTheMake(String theMake) {
		this.theMake = theMake;
	}

	public String toString() {
		return "Bus driven by " + theDriversName + " is a " + theMake + " with " + theNumberOfSeats + " seats.";
	}
}
