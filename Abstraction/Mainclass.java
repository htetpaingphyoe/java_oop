package Abstraction;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salary sa = new salary("Mg Mg", "Lan Gyo Lan Kyar", 3, 10000);
		Employee em = new salary("Ma Ma ", "Hledan ", 5, 20000);
		System.out.println("computing salary : " + sa.computePay());
		System.out.println("Computing salary : "+ em.computePay());
		
	}

}
