package term4ISTD;

// ATTENTION 
// just edit this file
// you need not edit Main.java


//ATTENTION 
//just edit this file
//you need not edit Main.java
import java.io.*;
import java.util.*;

public class IteratingExample {

 public static int Act2Iterator(List<Integer> integers) {
     
     int sum = 0;
     
     Iterator iterator = integers.iterator();
     while(iterator.hasNext()){
         sum += (int) iterator.next();
         
     }
     
     return sum;
 }
}
