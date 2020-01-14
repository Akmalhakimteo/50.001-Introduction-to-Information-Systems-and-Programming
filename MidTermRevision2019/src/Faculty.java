public class Faculty extends Employee {
  public static void main(String[] args) {
    new Faculty();
  }
  
  public Faculty() {
    System.out.println("(4) Faculty's no-arg constructor is invoked");
  }
}

class Employee extends Person1 {
  public Employee() {
    this("(2) Invoke Employee’s overloaded constructor");
    System.out.println("(3) Employee's no-arg constructor is invoked");
  }

  public Employee(String s) {
    System.out.println(s);
  }
}

class Person1 {
  public Person1() {
    System.out.println("(1) Person's no-arg constructor is invoked");
  }
}
