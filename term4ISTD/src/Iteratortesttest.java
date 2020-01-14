import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;;

public class Iteratortesttest {

  public static void main(String[] args) {
	  System.out.println(hailstone(10));
	  

  }
  
  public static LinkedList<Integer> hailstone(int n){
	  LinkedList<Integer> newlist = new LinkedList<Integer>();
	  newlist.add(n);
	  while(n>1) {
		  if(n%2==0) {
			  n=n/2;
			  newlist.add(n);
		  }
		  else if(n%2!=0) {
			  n=3*n+1;
			  newlist.add(n);
		  }
	  }
	  return newlist;
	  
	  
  }
  
  
  
}




