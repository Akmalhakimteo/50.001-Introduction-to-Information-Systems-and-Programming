//***[QUESTION 2b]*********
// ***ATTENTION*****
// >>>>click BUILD, followed by RUN button in Vocareum to execute main() 
//CODE IN THIS FILE IS FOR YOUR INFO
//YOU DO NOT NEED TO EDIT THIS FILE
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestClause {
    public static void main(String[] args) {


        Clause c1 = new Clause();
        c1.addToClause(new String[]{"a", "c", "c"});

        Clause c2 = new Clause();
        c2.addToClause(new String[]{"d", "a", "a"});

        Clause c3 = new Clause();
        c3.addToClause(new String[]{"x", "y"});

        Clause c4 = new Clause();


        ArrayList<Clause> formula1 = new ArrayList<>();
        formula1.add(c1);
        formula1.add(c2);
        formula1.add(c3);
        formula1.add(c4);


        System.out.println(formula1);
        Collections.sort(formula1);
        System.out.println(formula1);


    }
}
