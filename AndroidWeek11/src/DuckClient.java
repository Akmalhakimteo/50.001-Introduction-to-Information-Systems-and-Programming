import java.util.ArrayList;

public class DuckClient {
	
	static ArrayList<Duck> myDucks;
	
	public static void main(String[] args) {
		myDucks = new ArrayList<>();
		myDucks.add(new MallardDuck());
		makeDucksFlyQuack();
		Duck cosplayingTurkey = new TurkeyAdapter(new ChristmasTurkey());
		myDucks.add(cosplayingTurkey);
		makeDucksFlyQuack();
		
		
	}
	
	static void makeDucksFlyQuack(){
		for(Duck duck:myDucks) {
			System.out.println(duck);
			duck.fly();
			duck.quack();
		}
	}

}
