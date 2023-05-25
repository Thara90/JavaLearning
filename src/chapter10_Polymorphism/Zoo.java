package chapter10_Polymorphism;

public class Zoo {

    public static void main(String arg[]) {
        //Dog moxy = new Dog();
        //moxy.fetch();
        //moxy.makeSound();

        Animal moxy = new Dog();
        moxy.makeSound();

        moxy = new Cat();
        moxy.makeSound();
        ((Cat) moxy).scratch();
    }
}
