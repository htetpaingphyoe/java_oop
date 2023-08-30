package Inheritence;

/* Inheritance allows to create a subclass that inherits fields and methods from parent class
 * The child class can add or override methods to provide its behavior.
 * */
public class Account {
	String name;
	private double amount;
	protected double withdraw; // can be accesses by inherited classes

	protected Account() {
		System.out.println("Constructor without Param");
	}

	protected Account(String name) {
		System.out.println("Constructor with Param");
		this.name = name;
		
	}

	protected void setAmount(double amount) {
		if (amount > 0.0) {
			this.amount = amount;
		}
	}

	protected double getAmount() {
		return this.amount;
	}
}
