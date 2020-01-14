
public abstract class CaffeineBeverage {
	public static void main(String[] args) {
		CaffeineBeverage caffeineBeverage = new GourmetCoffee();
		caffeineBeverage.prepareRecipe();

	}
	
	//1 boil water   - always same
	//2 brew coffee   - changes 
	//3 add condiments  - changes
	//4 pour in cup     -same
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("boiling water");
	}
	void pourInCup() {
		System.out.println("pour in cup");
	}
	final void prepareRecipe() {   // declared final to preveent overriding by subclasses 
		/** AKA holywood principle; dont call us, we'll call you, > components are executed by one and one part only*/
		boilWater();
		brew();
		addCondiments();
		pourInCup();
	}

}


class GourmetCoffee extends CaffeineBeverage{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("put in coffee maker");
		
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("add gourmetcoffee stuff");
		
	}
	
}


