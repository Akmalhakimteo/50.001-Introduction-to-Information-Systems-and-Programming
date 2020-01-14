abstract class Dog{	
	
	public void bark(){ System.out.println("woof"); }
	public void drool(){ System.out.println("drool");}

	public static void main(String[] args) {
		Dog f = new Hound();
		f.bark();
		f.drool();
		
	//	Hound g = new Hound();
	//	g.bark();   //retry
	//	g.drool();
	
	}
}


class Hound extends Dog{
	public void sniff(){ System.out.println("sniff ");}
	@Override public void bark(){ System.out.println("growl");}
	public void drool(int time){ System.out.println("drool" + time);
	}
}
