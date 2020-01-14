
public class TurkeyAdapter implements Duck {//TurkeyAdapter IS a duck
	Turkey turkey;
	
	TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
		
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		turkey.fly();
		
	}

}
