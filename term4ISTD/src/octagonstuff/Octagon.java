package octagonstuff;
import java.util.*;

import piwords.maintesttest2;

public class Octagon implements Comparable <Octagon> {
	private double side; 
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	@Override
	public int compareTo(Octagon o) {
		if(this.side>o.side) {
			return 1;
		}
		else if(this.side<o.side) {
			return -1;
		}
		else {
			return 0;
		}
	}
	

}
//import java.util.*;
//
////YOU DO NOT NEED TO MODIFY THIS CODE 
//public class Test {
//  public static void main(String[] args) {
//      ArrayList<Octagon> l = new ArrayList<Octagon>();
//      l.add(new Octagon(2));
//      l.add(new Octagon(3));
//      l.add(new Octagon(1));
//      Collections.sort(l);
//      for (Octagon o:l)
//          System.out.println(o.getSide());
//  }
//}


