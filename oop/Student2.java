package oop;

import java.util.Scanner;

public class Student2 {
	String name;
	int age;
	
	public Student2(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		this.name = name;
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		this.age = age;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 st2 = new Student2();
		System.out.println("The name is "+st2.name+" and "+"The age is "+st2.age+".");

	}

}
