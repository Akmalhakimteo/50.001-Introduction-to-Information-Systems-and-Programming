package q1;


// starting code

public class Circle {
	private double x;
	private double y;
	private double radius;
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle() {
		this.x = 0.0;
		this.y = 0.0;
		this.radius = 1.0;
	}
	public Circle(double x, double y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double getArea(){
		return Math.PI * this.radius * this.radius;
	}
	
	public double getPerimeter() {
		return Math.PI * 2 * this.radius;
	}
	
	public boolean contains(double px, double py) {
		double xdiff = px - this.x;
		double xdiffsq = xdiff * xdiff;
		double ydiff = py - this.y;
		double ydiffsq = ydiff * ydiff;
		double distancefromcentretopoint = Math.sqrt(ydiffsq + xdiffsq);
		if(distancefromcentretopoint<=this.radius) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Circle c) {
		double distance2 = (c.x - this.x)*(c.x - this.x) + (c.y - this.y)*(c.y - this.y);
		double distance1 = Math.sqrt(distance2);
		
		if( c.radius > this.radius) {
			return false;
		}
		else {
			return distance1 <= (this.radius - c.radius);
		}	
	}
	
	public boolean overlaps(Circle c) {
		double distance2 = (c.x - this.x)*(c.x - this.x) + (c.y - this.y)*(c.y - this.y);
		double distance1 = Math.sqrt(distance2);
		return distance1 <= this.radius + c.radius;
	}
	
	
	
	
	
	
	
	
	
	
	

}
