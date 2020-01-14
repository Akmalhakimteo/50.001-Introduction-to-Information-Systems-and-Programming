import java.math.*;

class Triangle  {

  
	
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	public double getArea() {
		double s = (getSide1() + getSide2() + getSide3())/2;
		double intermediary = s * (s-getSide1()) * (s-getSide2()) * (s-getSide3());
		double area = Math.sqrt(intermediary);
		return area;
		
	}
	
	public double getPerimeter() {
		return getSide1() + getSide2() + getSide3();
	}
	
	public String toString() {
		return "Triangle: side1 = " + getSide1() + " side2 = " + getSide2() + " side3 = " + getSide3();
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	
	
	
}



