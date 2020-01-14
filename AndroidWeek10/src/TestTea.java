
public class TestTea {
	public static void main(String[] args) {
		
		Tea.TeaBuilder teaBuilder = new Tea.TeaBuilder();
		teaBuilder = teaBuilder.setIce(true).setMilk(true).setSugar(false).setTogo(true);
		Tea tea = teaBuilder.build();
		
		Tea.TeaBuilder trythis = new Tea.TeaBuilder();
		trythis.setIce(true);
		Tea teaTry = trythis.build();
	}
}
