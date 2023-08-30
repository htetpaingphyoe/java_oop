package javaprj;

import java.util.Scanner;

public class Switch_To_If_exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one Character");
		char testCase = sc.next().charAt(0);
		if(testCase == 'a') {
			System.out.println("b");
		}
		else if(testCase == 'b'){
			System.out.println("c");
		}
		else
			System.out.println("a");

	}

}
