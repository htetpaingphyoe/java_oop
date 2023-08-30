package oop;

public class Puppy {
	private int puppyAge;
	
	public Puppy(String name) {
		System.out.println("Name chosen is "+ name);
	}
	
	public void setAge(int age) {
		puppyAge = age ;
	}
	public int getAge() {
		return puppyAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy pp = new Puppy("Gote kyar.");
		pp.setAge(7);
		System.out.println("The age is "+pp.getAge());
	}

}
