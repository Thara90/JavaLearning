package Chapter11_Abstraction;

public abstract class Shape {

    //abstract method has no body
    //it's designed to overridden by a subclass
    abstract double calculateArea();

    public void print(){
        System.out.println("I am a shape");
    }
}
