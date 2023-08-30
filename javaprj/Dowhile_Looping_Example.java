package javaprj;
import java.util.*;
public class Dowhile_Looping_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String con;
		do {
			System.out.println("Enter one number : ");
			double fnum = sc.nextDouble();
			System.out.println("Enter second number : ");
			double snum = sc.nextDouble();
			System.out.println("Enter one symbols( '+' or '-' or 'x' or '/' or '%' )");
			char sym = sc.next().charAt(0);
			if(sym == '+') {
				System.out.println("The sum of the numbers is "+(fnum+snum));
			}
			else if(sym == '-') {
				System.out.println("The subtraction of the numbers is "+(fnum-snum));
			}
			else if(sym == 'x') {
				System.out.println("The multiplication of the numbers is "+(fnum*snum));
			}
			else if(sym == '/') {
				System.out.println("The division of the numbers is "+(fnum/snum));
			}
			else if(sym == '%') {
				System.out.println("The modulus of the numbers is "+(fnum%snum));
			}
			else {
				System.out.println("Wrong input!");
			}
			System.out.println("Do you wanna do it again? Type 'yes' or 'no'.");
			con = sc.next();
		}while(con.equalsIgnoreCase("yes"));
		System.out.println("Thank you for using this system!");
	}

}
