package q5;


import java.util.ArrayList;
import java.util.Arrays;

public class TestStronglyConnected {



    public static void main(String[] args) {


        int nodecount=4;
        int linkcount=3;
        ArrayList<Integer> l1 = new ArrayList<Integer> ( Arrays.asList(0,1, 1,2, 2,3));

        System.out.println(StronglyConnected.testStronglyConnected(nodecount, linkcount, l1));
        
    	int nodecount1=5;
		int linkcount1=5;
		ArrayList<Integer>	listOfLink1	=	new ArrayList<Integer>	(	Arrays.asList(0,1,		1,2,		2,3,		3,4,		4,0));
		System.out.println(StronglyConnected.testStronglyConnected(nodecount1,	linkcount1,	listOfLink1));

    }


}
