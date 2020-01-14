//***[QUESTION 1]*********
// ***ATTENTION*****
//CODE IN THIS FILE IS FOR YOUR INFO
//YOU DO NOT NEED TO EDIT THIS FILE

public abstract class GeometricObject {
 
    protected String color;
    protected boolean filled = false;
    protected java.util.Date dateCreated;
 
    public GeometricObject() {
        color = "yellow";
        dateCreated = new java.util.Date();
    }
 
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
 
    public String getColor() {
        return color;
    }
 
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
 
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
 
    public java.util.Date getDateCreated() {
        return dateCreated;
 
    }
 
    public String toString() {
        return "color: " + color + " filled: " + filled;
 
    }
 
    public abstract double getArea();
 
    public abstract double getPerimeter();
 
}