package startercode;

//***[QUESTION 2a]*********
// ***ATTENTION*****
//CODE IN THIS FILE IS FOR YOUR INFO
//YOU DO NOT NEED TO EDIT THIS FILE
public class Dog extends Animal  {
    public Dog(){

    }

    public Dog(int weight){
        super(weight);
    }

    @Override
    public String toString() {
        return "Dog: " + getWeight();
    }



}
