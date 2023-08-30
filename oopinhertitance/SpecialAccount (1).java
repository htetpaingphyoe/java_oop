package Inheritence;

public class SpecialAccount extends Account {
	public SpecialAccount() {
		super();
	}

	public SpecialAccount(String name, double withdraw) {
		/*
		 * Child class can access Parent's fields and methods. private fields and
		 * methods are not able to be accessed by child. e.g. amount protected fields
		 * are able to be accessed by child. e.g. withdraw
		 */
//		super();
		super(name);
		// amount = 100; // amount is private and cannot be accessed directly
		this.withdraw = withdraw; // inherited so that withdraw is able to accessed via this.
	}

	public void getResult() {
		System.out.println("Username" + this.name); // inherited deault var
		System.out.println("Total Amount " + getAmount()); // inherited protected method
		System.out.println("Withdraw Amount " + this.withdraw); // inherited private var
		System.out.println("Remaining Amount " + (getAmount() - this.withdraw));
	}

	public static void main(String[] args) {
		SpecialAccount sa = new SpecialAccount("Mg Mg", 300);
		sa.setAmount(1000);
		sa.getResult();
	}
}
