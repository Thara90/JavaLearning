package chapter11_Interfaces;

public interface Product {

    //we don't have to write the keyword of abstract.
    //we don't put access modifier because in default they are public
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarCode() {
        return "no barcode";
    }
}
