package octagonstuff;

import java.util.ArrayList;
import java.util.Collections; 

//YOU DO NOT NEED TO MODIFY THIS CODE 
public class TestOctagonComparator {
public static void main(String[] args) {
    ArrayList<Octagon> l = new ArrayList<Octagon>();
    l.add(new Octagon(2));
    l.add(new Octagon(3));
    l.add(new Octagon(1));
    Collections.sort(l, new OctagonComparator());
    for (Octagon o:l)
        System.out.println(o.getSide());
    System.out.println(l.get(0));
}
}
