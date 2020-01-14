package startercode;


//***[QUESTION 2a]*********
import java.util.Comparator;

public class MyComparator implements Comparator<Animal> {

	@Override
	public int compare(Animal o1, Animal o2) {
		if(o1.getWeight()>o2.getWeight()) {
			return 1;
		}
		else if(o1.getWeight()<o2.getWeight()) {
			return -1;
		}
		else {
			return 0;
		}
	}
    //TODO: implement MyComparator class


}
