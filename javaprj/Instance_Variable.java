package javaprj;

public class Instance_Variable {
	static String name = "Htet";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getname();
		Instance_Variable iv = new Instance_Variable();
		iv.getAge();
	}
	public static void getname() {
		System.out.println(name);
	}
	public void getAge() {
		int age = 18;
		System.out.println(age);
	}
}
