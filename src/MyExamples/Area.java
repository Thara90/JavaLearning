package MyExamples;

public class Area {

    public static void main(String args[]){

        Square r1=new Square();
        double defaultArea=r1.calculateArea();
        System.out.println("defaultArea "+defaultArea);
        double area1=r1.calculateArea(20,10);
        System.out.println("defaultArea "+defaultArea);
        double area2=r1.calculateArea(10.5,5.5);
        System.out.println("defaultArea "+defaultArea);

    }
}
