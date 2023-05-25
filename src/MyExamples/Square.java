package MyExamples;

public class Square {

    private double length;
    private double width;

    public Square(){
        length=4;
        width=3;
    }

    public double calculateArea(){
        return (length*width);
    }

    public double calculateArea(double length,double width){
        return (length*width);
    }
}
