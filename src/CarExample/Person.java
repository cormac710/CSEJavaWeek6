package CarExample;

public class Person {
	private String name;
	private String address;
	private boolean drinkDrivingOffence;
	private boolean caughtWithoutASeatbelt;
	private boolean dangerousOvertaking;
	private boolean usingMobileWhileDriving;
	private boolean drivingDefectiveVehicle;
	private boolean crossingContiniousWhileLine;
	private Car car;
	private int totalPenaltyPoints;

	public Person(String name, String address, Car car) {
		this.name = name;
		this.address = address;
		this.car = car;
	}

	public Person(String name, String address, boolean arg3, boolean arg4,
			boolean arg5, boolean arg6, boolean arg7,
			boolean arg8, Car car) {
		this.name = name;
		this.address = address;
		this.drinkDrivingOffence = arg3;
		this.caughtWithoutASeatbelt = arg4;
		this.dangerousOvertaking = arg5;
		this.usingMobileWhileDriving = arg6;
		this.drivingDefectiveVehicle = arg7;
		this.crossingContiniousWhileLine = arg8;
		this.car = car;
	}

	public void calculatePenaltyPoints() {
		int total = 0;
		if(drinkDrivingOffence){
			total +=5;
		}
		if (caughtWithoutASeatbelt){
			total +=5;
		}
		if (dangerousOvertaking){
			total +=5;
		}
		if (usingMobileWhileDriving){
			total +=4;
		}
		if (drivingDefectiveVehicle){
			total +=5;
		}
		if(crossingContiniousWhileLine){
			total +=4;
		}
		
		setTotalPenaltyPoints(total);
	}

	public boolean isDisqualified() {
		boolean isDisquaified = false;
		if(totalPenaltyPoints > 12){
			isDisquaified = true;
		}
		return isDisquaified;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isDrinkDrivingOffence() {
		return drinkDrivingOffence;
	}

	public void setDrinkDrivingOffence(boolean drinkDrivingOffence) {
		this.drinkDrivingOffence = drinkDrivingOffence;
	}

	public boolean isCaughtWithoutASeatbelt() {
		return caughtWithoutASeatbelt;
	}

	public void setCaughtWithoutASeatbelt(boolean caughtWithoutASeatbelt) {
		this.caughtWithoutASeatbelt = caughtWithoutASeatbelt;
	}

	public boolean isDangerousOvertaking() {
		return dangerousOvertaking;
	}

	public void setDangerousOvertaking(boolean dangerousOvertaking) {
		this.dangerousOvertaking = dangerousOvertaking;
	}

	public boolean isUsingMobileWhileDriving() {
		return usingMobileWhileDriving;
	}

	public void setUsingMobileWhileDriving(boolean usingMobileWhileDriving) {
		this.usingMobileWhileDriving = usingMobileWhileDriving;
	}

	public boolean isDrivingDefectiveVehicle() {
		return drivingDefectiveVehicle;
	}

	public void setDrivingDefectiveVehicle(boolean drivingDefectiveVehicle) {
		this.drivingDefectiveVehicle = drivingDefectiveVehicle;
	}

	public boolean isCrossingContiniousWhileLine() {
		return crossingContiniousWhileLine;
	}

	public void setCrossingContiniousWhileLine(boolean crossingContiniousWhileLine) {
		this.crossingContiniousWhileLine = crossingContiniousWhileLine;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getTotalPenaltyPoints() {
		return totalPenaltyPoints;
	}

	public void setTotalPenaltyPoints(int totalPenaltyPoints) {
		this.totalPenaltyPoints = totalPenaltyPoints;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", drinkDrivingOffence=" + drinkDrivingOffence
				+ ", caughtWithoutASeatbelt=" + caughtWithoutASeatbelt + ", dangerousOvertaking=" + dangerousOvertaking
				+ ", usingMobileWhileDriving=" + usingMobileWhileDriving + ", drivingDefectiveVehicle="
				+ drivingDefectiveVehicle + ", crossingContiniousWhileLine=" + crossingContiniousWhileLine + ", car="
				+ car + ", totalPenaltyPoints=" + totalPenaltyPoints + "]";
	}

}
