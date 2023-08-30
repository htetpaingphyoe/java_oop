package interfacee;

public interface shapes {
	public double area();
	public double perimeter();
}

class Circle implements shapes{
	private double radius;
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	public double area() {
		
		return Math.PI*radius*radius;
	}

	@Override
	public double perimeter() {
		
		return 2.0*Math.PI*radius;
	}
	
}

class Rectangle implements shapes{
	private double width;
	private double height;
	Rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		
		return width*height;
	}

	@Override
	public double perimeter() {
		
		return 2.0*(width+height);
	}
	
}

class Triangle implements shapes{
	private double z;
	private double x;
	private double y;
	Triangle(double a,double b,double c){
		this.z = a;
		this.x = b;
		this.y = c;
	}
	@Override
	public double area() {
		double s = (z+y+x)/2.0;
		return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}

	@Override
	public double perimeter() {
		
		return z+x+y;
	}
	
}