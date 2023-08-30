package oop;

public class Animal {
	String color = "White";
	Animal(){
		System.out.println("Animal is created.");
	}
	public void display() {
		System.out.println("Display method of Animal class ");
	}
}
class dog extends Animal{
	String color = "black";
	dog(){
		super();
		System.out.println("Dog is created.");
	}
	public void display() {
		System.out.println("display method of Dog class");
	}
	public void colorprint() {
		System.out.println(color);
		System.out.println(super.color);
		display();
		super.display();
	}
	
}
class testsuper{
	public static void main(String[] args) {
		dog d = new dog();
		d.colorprint();
		
	}
}
