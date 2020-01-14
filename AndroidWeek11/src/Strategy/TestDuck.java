package Strategy;

public class TestDuck {
	public static void main(String[] args) {
		Duck duck = new Duck("nigga duck");
		QuackBehaviour loudQuack = new LoudQuack();
		QuackBehaviour softQuack = new SoftQuack();
		QuackBehaviour niggaQuack = new NiggaQuack();
		/** strategy design pattern allows behaviour to be set at runtime */
		duck.setQuackBehaviour(niggaQuack);
		duck.quack();
	}

}
