package UMLExamples;

import java.util.Scanner;

public class BusDepot {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Bus b1 = new Bus();
		Bus b2 = new Bus();
		b1.setTheDriversName("John");
		b1.setTheMake("volvo");
		b1.setTheNumberOfSeats(24);
		b2.setTheDriversName("mary");
		b2.setTheMake("volvo");
		b2.setTheNumberOfSeats(44);

		Bus b3 = new Bus(23, "Pat", "Ford");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		System.out.println("count " + Bus.getTheCount());

		System.out.println("Driver b1 : " + b1.getTheDriversName());
		System.out.println("Make b1 : " + b1.getTheMake());
		System.out.println("Seats b1 : " + b1.getTheNumberOfSeats());
		
		System.out.println("=== User Input ===");
		System.out.print("Enter Driver Name : ");
		String name = sc.next();
		System.out.print("Enter Bus Make : ");
		String make = sc.next();
		System.out.print("Enter Number of Seats : ");
		int seats = sc.nextInt();
		
		b1.setTheDriversName(name);
		b1.setTheMake(make);
		b1.setTheNumberOfSeats(seats);
		
		b3 = new Bus(seats, name, make);
		
		System.out.println("bus 1 " + b1.getTheDriversName());
		System.out.println("bus 3 " + b3.getTheMake());
		System.out.println(Bus.getTheCount());
	}
}
