package Abstraction;

public class Chevy extends Auto {

	@Override
	public void setPrice() {
		// TODO Auto-generated method stub
		 price = 15000;
		 carmake = "Chevy";
		 System.out.println("The Types of Car is "+carmake);
		 System.out.println("The price of "+carmake+" is "+price+".");
	}

}
