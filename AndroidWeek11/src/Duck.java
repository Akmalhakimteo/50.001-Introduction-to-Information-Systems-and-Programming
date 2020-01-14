
public interface Duck {
	 void quack ();
	 void fly ();
}

//class NewDuck extends Duck{
//	
//	NewDuck(String name){
//		super(name);
//	}
//	
//	@Override
//	void quack() {
//		//new implementation
//	}
//	
//	
//}

/**quack needs to be modified
* (1) delete existing code - write new one - no good , will affect other parts of software
* (2) inherit and override quack (write new code) -> inheritence doesn't make sense
* NewDuck is not a more specific kind of Duck
* New Duck() ==> new NewDuck()
* Solution: think of other parts that could change
* give those parts to other objects
* 
*/
