package chapter6;

public class HomeAreaCalculator {
    public static void main(String arg[]) {
        //RECTANGLE 1
        //create instance of rectangle class
        Rectangle room1= new Rectangle();
        room1.setWidth(25);
        room1.setLength(100);
        double areaOfRoom1= room1.calculateArea();

        //RECTANGLE 1
        Rectangle room2= new Rectangle(20, 50);
        double areaOfRoom2= room1.calculateArea();

        double totalArea = areaOfRoom1+areaOfRoom2;

        System.out.println("Are of both rooms are "+totalArea);

    }
}
