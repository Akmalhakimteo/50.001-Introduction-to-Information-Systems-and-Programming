package term4ISTD;

public class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;
	
	public MyRectangle2D() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}
	
	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return getHeight()*getWidth();
	}
	public double getPerimeter() {
		return 2*getHeight() + 2*getWidth();
	}
	public boolean contains(double x,double y) {  //check this please
		double x_left = getX() - (getWidth()/2);
		double x_right = getX() + (getWidth()/2);
		double y_top = getY() + (getHeight()/2);
		double y_bottom = getY() - (getHeight()/2);
		if( (x>x_left) && (x<x_right) && (y<y_top) && y>y_bottom) {
			return true;
		}
		return false;
	}
	
	public boolean contains(MyRectangle2D r) {
		double x_left = getX() - (getWidth()/2);
		double x_right = getX() + (getWidth()/2);
		double rx_left = r.getX() - (r.getWidth()/2);
		double rx_right = r.getX() + (r.getWidth()/2);
		
		double y_top = getY() + (getHeight()/2);
		double y_bottom = getY() - (getHeight()/2);
		double ry_top = r.getY() + (r.getHeight()/2);
		double ry_bottom = r.getY() - (r.getHeight()/2);
		
		if( (rx_left>x_left) && (rx_right<x_right) && (ry_top<y_top) && (ry_bottom> y_bottom)) {
			return true;
		}
		return false;
	}
	
	public boolean overlaps(MyRectangle2D r) {
		double x_left = getX() - (getWidth()/2);
		double x_right = getX() + (getWidth()/2);
		double rx_left = r.getX() - (r.getWidth()/2);
		double rx_right = r.getX() + (r.getWidth()/2);
		
		double y_top = getY() + (getHeight()/2);
		double y_bottom = getY() - (getHeight()/2);
		double ry_top = r.getY() + (r.getHeight()/2);
		double ry_bottom = r.getY() - (r.getHeight()/2);
		
		if( this.contains(rx_left,ry_top) || this.contains(rx_left, ry_bottom) || this.contains(rx_right, ry_bottom) || this.contains(rx_right, ry_top)) {
			return true;
		}
		return false;
	}
	









	
	
	
	
}
