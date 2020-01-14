
public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		if( (getA()*getD() - getB()*getC()) != 0 ) {
			return true;
		}
		return false;
		
	}
	public double getY() {
		if(isSolvable()){
			double numerator = getA()*getF()-getC()*getE();
			double denominator = getA()*getD() - getB()*getC();
			return numerator/denominator;
		}
		return -1;
		
				
	}
	
	public double getX() {
		if(isSolvable()) {
			double numerator = getB()*getF() - getD()*getE();
			double denominator = (getA()*getD() - getB()*getC())*-1;
			return numerator/denominator;
		}
		return -1;
	}
	
	
	
}
