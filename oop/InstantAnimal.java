package oop;

public class InstantAnimal {
	public String name;
	public int height;
	private String gender;
	int ui = 1;
	
	public String getgender(String gen) {
		this.gender = gen;
		return gender;
	}
	
	public void getname() {
		name = "Aung Net";
		height = 4;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstantAnimal ia = new InstantAnimal();
		ia.getname();
		System.out.println(ia.height);
		System.out.println(ia.name);
		System.out.println(ia.gender);
		ia.getgender("Male");
		System.out.println(ia.gender);
		System.out.println(ia.ui);
		
		
		
	}

}
