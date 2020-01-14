import java.util.Comparator;



public class OctagonComparator implements Comparator<Octagon>{

	@Override
	public int compare(Octagon o1, Octagon o2) {
		// TODO Auto-generated method stub
		if(o1.getSide()>o2.getSide()) {
			return 1;
		}
		if(o2.getSide()>o1.getSide()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	
}
