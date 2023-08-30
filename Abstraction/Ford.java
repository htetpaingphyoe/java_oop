package Abstraction;

public class Ford extends Auto{

	@Override
	public void setPrice() {
		// TODO Auto-generated method stub
		price = 10000;
		carmake = "Ford";
		System.out.println("The Types of Car is "+carmake);
		System.out.println("The price of "+carmake+" is "+price+".");
	}
	
}
