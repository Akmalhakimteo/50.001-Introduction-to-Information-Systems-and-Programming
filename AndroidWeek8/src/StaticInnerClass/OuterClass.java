package StaticInnerClass;

public class OuterClass {
	 int a;
	 OuterClass(){ a = 10 ; }
	 void outerPrintA (){ System.out.println(a); }
	 static class InnerClass {
		 int c;
		 InnerClass(){ c = 100 ; 
		 }
	 
	 
	}
} 