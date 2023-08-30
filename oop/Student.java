package oop;

public class Student {
	public Student(){
		System.out.println("This is created constructor.");
	}
	public Student(String name) {
		System.out.println("The name is "+name);
	}
	public Student(int num) {
		System.out.println("The number is "+num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sc = new Student("Maung Maung");
		Student sc1 = new Student();
		Student sc2 = new Student(15);
	}
}
