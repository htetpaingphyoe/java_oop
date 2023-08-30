package interfacee;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cr = new Circle(4.0);
		System.out.println("Circle Area : "+cr.area());
		System.out.println("Circle Perimeter : "+cr.perimeter());
		
		Rectangle r = new Rectangle(5.0,6.0);
		System.out.println("Rectangle Area : "+r.area());
		System.out.println("Rectangel Perimeter : "+r.perimeter());
		
		Triangle t = new Triangle(2.0,3.0,4.0);
		System.out.println("Triangle Area : "+t.area());
		System.out.println("Triangle Perimeter : " + t.perimeter());
	}

}
 