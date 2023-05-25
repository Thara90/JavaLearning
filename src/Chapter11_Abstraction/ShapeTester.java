package Chapter11_Abstraction;

public class ShapeTester {
    public static void main(String[] args){
        //cannot instantiate an abstract class - Shape rectangle = new Shape() is incorrect
        //abstract classes are meant to be a template
        Shape rectangle = new Rectangle(5,10);
        rectangle.print();
        System.out.println(rectangle.calculateArea());

    }
}
