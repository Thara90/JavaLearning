package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    public static void main(String arg[]) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculatorTotalArea(kitchen, bathroom);
    }

    public Rectangle getRoom(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length");
        Double length = scanner.nextDouble();

        System.out.println("Enter width");
        Double width = scanner.nextDouble();

        scanner.close();

        Rectangle room = new Rectangle(length, width);
        return room;
    }

    double calculatorTotalArea(Rectangle kitchen, Rectangle bathroom ){
        return kitchen.calculateArea()+bathroom.calculateArea();
    }
}
