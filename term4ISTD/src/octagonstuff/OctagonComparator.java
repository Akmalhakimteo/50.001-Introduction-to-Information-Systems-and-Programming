package octagonstuff;
import java.util.Comparator;

public class OctagonComparator implements Comparator<Octagon> {

	@Override
	public int compare(Octagon o1, Octagon o2) {
		// TODO Auto-generated method stub
		if(o1.getSide()>o2.getSide()) {
			return 1;
			
		}
		else if(o1.getSide()<o2.getSide()) {
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
//public class TestOctagonComparator {
//  public static void main(String[] args) {
//      ArrayList<Octagon> l = new ArrayList<Octagon>();
//      l.add(new Octagon(2));
//      l.add(new Octagon(3));
//      l.add(new Octagon(1));
//      Collections.sort(l, new OctagonComparator());
//      for (Octagon o:l)
//          System.out.println(o.getSide());
//  }
//}

