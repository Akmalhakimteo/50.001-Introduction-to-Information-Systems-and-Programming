package foobarthingy;

public class TestFoo {
	 public static void main (String[] argv){
		 
		 Foo tryf = new Foo();
		 tryf.thirsty(new Foo.Bar() {
			
			@Override
			public void drink() {
				// TODO Auto-generated method stub
				System.out.println("wtfdsan");
				
			}
		});
		 
		 
		 Foo f = new Foo();
		 f.thirsty( new Foo.Bar() {       //anonymous inner class
			@Override
			public void drink() {
				System.out.println("kanpai");	
			}
		 }
		 );
	 }
	 static class C implements Foo.Bar {   //non anonymous inner class
		 @Override
		 public void drink () {
		 System.out.println( "gulp" );
		 }
	}
} 