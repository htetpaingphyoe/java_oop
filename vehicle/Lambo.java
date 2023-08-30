package vehicle;

public class Lambo extends Car{
	public void Viewgetname() {
	super.getname("Aung Aung ", 20);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambo lam = new Lambo();
		lam.Viewgetname();
	}

}
