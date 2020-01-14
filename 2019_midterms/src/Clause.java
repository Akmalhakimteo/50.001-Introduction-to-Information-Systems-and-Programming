//***[QUESTION 2b]*********
//TODO: Modify this code to answer the question 
import java.util.ArrayList;

public class Clause extends ArrayList<String> implements Comparable<Clause> {
    private int numberClause = 0;
	
	public Clause() {
        super();
        
    }

    public void addToClause(String [] a) {
        for (String s:a)
            this.add(s);
        	numberClause+=a.length;
    }
    public int clauseSize() {
    	return this.numberClause;
    }

	@Override
	public int compareTo(Clause o) {
		if(this.clauseSize()>o.clauseSize()) {
			return 1;
		}
		else if(this.clauseSize()<o.clauseSize()) {
			return -1;
		}
		else {
			return 0;
		}
	}



}
