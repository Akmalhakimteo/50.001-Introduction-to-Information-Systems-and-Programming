package Strategy;

public interface QuackBehaviour {
	void quack();

}

class LoudQuack implements QuackBehaviour{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("QUACKKKKKKKKKKK");
		
	}
	
}

class NiggaQuack implements QuackBehaviour{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("yo wtf quack");
		
	}
	
}

class SoftQuack implements QuackBehaviour{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("......quack......");
		
	}
	
}
