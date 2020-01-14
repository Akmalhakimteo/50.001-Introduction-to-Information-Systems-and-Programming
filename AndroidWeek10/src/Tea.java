
public class Tea {
	
	private boolean sugar;
	private boolean milk;
	private boolean ice;
	private boolean toGo;
	
	private Tea(TeaBuilder teaBuilder) {
		this.ice = teaBuilder.ice;
		this.milk = teaBuilder.milk;
		this.sugar = teaBuilder.sugar;
		this.toGo = teaBuilder.toGo;
		System.out.println("" + ice + milk + sugar + toGo);
	}

	static class TeaBuilder{
		private boolean sugar;
		private boolean milk;
		private boolean ice;
		private boolean toGo;
		
		TeaBuilder(){}
		
		public TeaBuilder setSugar(boolean sugar) {
			this.sugar = sugar;
			return this;
		}
		
		public TeaBuilder setMilk(boolean milk) {
			this.milk = milk;
			return this;
		}
		public TeaBuilder setIce(boolean ice) {
			this.ice = ice;
			return this;
		}
		public TeaBuilder setTogo(boolean toGo) {
			this.toGo = toGo;
			return this;
		}
		
		public Tea build() {
			return new Tea(this);
		}
		
	}
	
	public static void main(String[] args) {
		Tea newtealive = new Tea.TeaBuilder().setIce(true).setMilk(true).setSugar(true).setTogo(false).build();
		//System.out.println(newtealive);
	}
	
	
	
	// you have more combinations now
	//1) write more constructors - builder design pattern
	//2) write more static factory methods
	// ==> you will write alot of them!
	// if you declare private, static factory method is the only way to create an instance
	// you can use the builder design pattern 
	
	

}
