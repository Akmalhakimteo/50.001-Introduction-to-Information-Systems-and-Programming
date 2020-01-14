
public class Circle {
	
	private double radius = 1;
	static int numberOfCircle;
	
	Circle(){
		numberOfCircle++;
		
	}
	Circle(double newRadius){
		this.radius = newRadius;
		numberOfCircle++;
	}
	
	public static void main(String[] args) {
		Circle circle1 = new Circle(4);
		Circle circle2 = new Circle();
		Circle circle3 = new Circle(23);
		
		System.out.println(circle1.radius);
		System.out.println(Circle.numberOfCircle);
	}

}
