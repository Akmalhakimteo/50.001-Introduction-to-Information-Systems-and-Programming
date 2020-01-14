package Strategy;

public class Duck {
	String name;
	QuackBehaviour quackBehaviour;
	
	Duck(String name){
		this.name = name;
	}
	
	void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	void quack() {
		quackBehaviour.quack();
	}
	

}
