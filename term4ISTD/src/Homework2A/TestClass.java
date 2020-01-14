package Homework2A;

//package Homework2A; //remember to comment out

//**SEE BELOW** Add in the code for the interfaces below 
public class TestClass {

	
	
	
	
	
  //DO NOT MODIFY THIS METHOD
  public static void main(String[] args) {
      C2 x = new C2();

      System.out.println(x instanceof I1);
      System.out.println(x instanceof I2);
      System.out.println(x instanceof I3);
      System.out.println(x instanceof I4);
      System.out.println(x instanceof I5);
      System.out.println(x instanceof C1);

      C3 y = new C3();

      System.out.println(y instanceof I1);
      System.out.println(y instanceof I2);
      System.out.println(y instanceof I3);
      System.out.println(y instanceof I4);
      System.out.println(y instanceof I5);

  }
}

//Modify from here onwards .... 
//Add and modify the code for interfaces and classes according to the question

interface I1{
  int P1();
}

interface I2{
	int P2();
}

interface I3{
	int P3();
}

interface I4 extends I1,I2,I3  {
	int P4();
}
interface I5 extends I3{
	int P5();
}
abstract class C1 implements I4  {
	abstract int Q1();
	
}

class C2 extends C1 implements I5{
    @Override
	public int P1() { return 0;}
    @Override
	public int P2() { return 0;}
    @Override
	public int P3() { return 0;}
    @Override
	public int P4() { return 0;}
    @Override
	public int P5() { return 0;}
	@Override
	int Q1() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class C3 implements I5 {
	public int P3() { return 0;}
	public int P5() { return 0;}
  

}

