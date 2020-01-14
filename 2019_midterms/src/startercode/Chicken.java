package startercode;

//***[QUESTION 2a]*********
// ***ATTENTION*****
//CODE IN THIS FILE IS FOR YOUR INFO
//YOU DO NOT NEED TO EDIT THIS FILE
public class Chicken extends Animal {
    public Chicken(){

    }

    public Chicken(int weight){
        super(weight);
    }

    @Override
    public String toString() {
        return "Chicken: " + getWeight();
    }
}


