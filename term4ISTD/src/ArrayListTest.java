import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	
	public static void Iterate1() {
		ArrayList<String> sentence = new ArrayList<String>();     // First type of ArrayList
		sentence.add("hello");
		sentence.add("there");
		sentence.add("friend");
//		
//		for(int i=0;i<sentence.size();i++) {
//			System.out.println(sentence.get(i));
//		}
		
//		for(String s:sentence) {
//			System.out.println(s);
//		}
		
//		for( Iterator<String> iter = sentence.iterator(); iter.hasNext();) {
//			System.out.println(iter);
//		}
		
	}
	
	public static void main(String[] args) {
		Iterate1();
	}
	
	

}
