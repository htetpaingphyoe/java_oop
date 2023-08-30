package javaprj;

import java.util.Scanner;

public class Typeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter Username");
			String username = sc.nextLine();
			System.out.println("Enter Password");
			String password = sc.nextLine();
			if(username.equals("Htet Paing")&& password.equals("123")) {
				System.out.println("Login Successful!");
			}
			else {
				System.out.println("Login fail");
		}
		}
	}
