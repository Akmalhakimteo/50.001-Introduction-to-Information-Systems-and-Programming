public class TestAbstract {
		public static void main(String[] args) {
	    	Feline tora = new Tiger("Tiger","sumatran tiger");
	    	tora.sound();
	    		
			
		}
	}



abstract class Feline{

    private String name;
    private String breed;

    public Feline(String name, String breed){
        this.breed = breed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public abstract void sound();
    
    
    
}


	class Tiger extends Feline{
		
		Tiger(String name, String breed){
			super(name,breed);
			
		}

		@Override
		public void sound() {
			// TODO Auto-generated method stub
			System.out.println("yeah tiger");
			
		}
	}
	
	