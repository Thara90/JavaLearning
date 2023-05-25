package MyExamples;

public class Test {

    private static double length = 4;
    private static double width = 3;

    public static void main(String args[]) {

        calculateArea();
        double area1=calculateArea(20, 10);
        System.out.println("area1 "+area1);
        double area2=calculateArea(10.5, 5.5);
        System.out.println("area2 "+area2);

    }

    public static void calculateArea() {
        System.out.println("default area " + length * width);
    }

    public static double calculateArea(double lenght, double width) {
        return (lenght * width);
    }
}