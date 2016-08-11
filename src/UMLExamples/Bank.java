package UMLExamples;

public class Bank {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setAccountNo(10001);
		c1.setBalance(50.25);
		c1.setName("John");

		Customer c2 = new Customer("pat", 10006, 100.75);

		System.out.println(c1 + "\n" + c2 + "\n" + Customer.getCount());

	}

}
