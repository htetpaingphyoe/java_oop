package Abstraction;

public class salary extends Employee{
	double salary;
	salary(String name, String address,int number,double salary) {
		super(name, address, number);
		setsalary(salary);
		// TODO Auto-generated constructor stub
	}
	public void setsalary(double salary) {
		if(salary>=0.00) {
			this.salary = salary;
		}
	}
	public double getSalary() {
		return this.salary;
	}
	

	@Override
	public double computePay() {
		// TODO Auto-generated method stub
		System.out.println("Employee name : "+getName());
		double result = salary/52;
		return result;
	}
	
	
}
