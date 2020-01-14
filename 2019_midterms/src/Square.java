
public class Square extends GeometricObject {
	private double x;
	private double y;
	private double sideLength;
	
	Square(){
		x=0;
		y=0;
		sideLength = 1;
	}

	public Square(double x, double y, double sideLength) {
		super();
		this.x = x;
		this.y = y;
		this.sideLength = sideLength;
	}
	
	boolean contains(double x,double y){
		double xdiff = Math.abs(this.x-x);
		double ydiff = Math.abs(this.y-y);
		if(xdiff<=this.sideLength/2&&ydiff<=this.sideLength) {
			return true;
		}
		return false;
		
		
	}
	
	boolean contains(Square inSquare) {
		double halflength = inSquare.sideLength/2;
		double topleft_x = inSquare.x-halflength;
		double topleft_y = inSquare.y+halflength;
		double topright_x = inSquare.x + halflength;
		double topright_y = inSquare.y + halflength;
		double bottomleft_x = inSquare.x - halflength;
		double bottomleft_y = inSquare.y - halflength;
		double bottomright_x = inSquare.x + halflength;
		double bottomright_y = inSquare.y - halflength;
		return contains(topleft_x,topleft_y)&&contains(topright_x,topright_y)&&
				contains(bottomleft_x,bottomleft_y)&&contains(bottomright_x,bottomright_y);
		
	}

	@Override
	public double getArea() {
		return this.sideLength*this.sideLength;
	}

	@Override
	public double getPerimeter() {
		return this.sideLength*4;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public static void main(String[] args) {
		 
        Square a = new Square(0,0,4);
        System.out.println(a.getPerimeter());
        System.out.println(a.contains(1, 1));
        System.out.println(a.contains(-3, 1));
        System.out.println(a.contains( new Square(0.5, -0.5, 2)));
        System.out.println(a.contains( new Square(1.5, 1.5, 2)));
 
 
        /*
result:
 
16.0
true
false
true
false
         */
 
    }
	
	
	
}
