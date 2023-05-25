package chapter10_Polymorphism;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("meow");
    }

    public void scratch(){
        System.out.println("scratch is fun");
    }
}