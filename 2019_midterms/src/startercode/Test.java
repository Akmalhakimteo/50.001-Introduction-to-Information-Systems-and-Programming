package startercode;

//***[QUESTION 2a]*********
// ***ATTENTION*****
// >>>>click BUILD, followed by RUN button in Vocareum to execute main() 
//CODE IN THIS FILE IS FOR YOUR INFO
//YOU DO NOT NEED TO EDIT THIS FILE
import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        Chicken c1 = new Chicken(10);
        Chicken c2 = new Chicken();
        Dog d1 = new Dog(30);

        ArrayList<Animal> t = new ArrayList<>();

        t.add(c1);
        t.add(c2);
        t.add(d1);

        System.out.println(t);
        Collections.sort(t, new MyComparator());
        System.out.println(t);


        /*
before sorting:
[Chicken: 10, Chicken: 50, Dog: 30]

after sorting:
[Chicken: 10, Dog: 30, Chicken: 50]

         */


    }
}
