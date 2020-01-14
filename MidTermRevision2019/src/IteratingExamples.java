import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingExamples {

	 public static int Act2Iterator(List<Integer> integers) {
	     
	     int sum = 0;
	     
	     Iterator iterator = integers.iterator();
	     while(iterator.hasNext()){
	         sum += (int) iterator.next();
	         
	     }
	     
	     return sum;
	 }
	 
	 public static int Act2ForEach(List<Integer> integers) {
         int sum = 0;
         
         for(int j:integers) {
       	sum += j;
       }
         return sum;
     }
	
public static void main(String[] args) {
        
	    String ans="";

		IteratingExamples iteratingexamples = new IteratingExamples();
		List< Integer > integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		String ans1 = "" + iteratingexamples.Act2Iterator(integers);
		ans = "Iterator Sum = " + ans1;

        System.out.println(ans);
  }
	
}

