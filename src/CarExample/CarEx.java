package CarExample;

import java.util.ArrayList;
import java.util.Scanner;

public class CarEx {
	static ArrayList<Person> person = new ArrayList<Person>();
	static Scanner sc = new Scanner(System.in);
	static Car c = new Car("Audi", "A4", 10);
	static Car c1 = new Car("VW", "Passat", 1);
	static Person p0 = new Person("John", "Sligo", true, true, true, false, true, false, c);
	static Person p1 = new Person("Pat", "Athlone", false, false, false, false, false, false, c1);
	static Person p2 = new Person("Joe", "Dublin", false, true, false, false, true, false, c1);

	public static void main(String[] args) {

		System.out.println(c);
		System.out.println(p0);
		System.out.println();

		person.add(p0);
		person.add(p1);
		person.add(p2);
		int count = 1;
		for (Person p : person) {
			System.out.println("===== Person " + count + " =====");
			System.out.println(p.getName() + " from " + p.getAddress() + " drives a " + p.getCar().getCarModel() + " "
					+ p.getCar().getCarType());
			p.calculatePenaltyPoints();
			System.out.println("Has " + p.getTotalPenaltyPoints() + " Penalty points");

			if (p.isDisqualified()) {
				System.out.println(p.getName() + " is disqualified");
			}
			System.out.println();
			System.out.println("Your Offences are : ");
			int countOffences = 0;
			if (p.isDrinkDrivingOffence()) {
				System.out.println("Drink Driving");
				++countOffences;
			}
			if (p.isCaughtWithoutASeatbelt()) {
				System.out.println("No seatbelt");
				++countOffences;
			}
			if (p.isDangerousOvertaking()) {
				System.out.println("Dangerous Overtaking");
				++countOffences;
			}
			if (p.isUsingMobileWhileDriving()) {
				System.out.println("Using mobile driving");
				++countOffences;
			}
			if (p.isDrivingDefectiveVehicle()) {
				System.out.println("driving defective vehicle");
				++countOffences;
			}
			if (p.isCrossingContiniousWhileLine()) {
				System.out.println("Crossing white line");
				++countOffences;
			}

			if (countOffences == 0) {
				System.out.println("You have no offences");
			} else {
				System.out.println("Total offences : " + countOffences);
			}
			
			System.out.println();
			++count;
		}

	}

}
