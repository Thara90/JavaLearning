package chapter5;

import java.util.Scanner;

public class CalculatePhoneBill {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter plan fee");
        Double planFee = scanner.nextDouble();

        System.out.println("Enter overage minutes");
        Double overageMinutes = scanner.nextDouble();

        scanner.close();

        double overage=calculateOverage(overageMinutes);
        double subTotal=planFee+overage;
        double tax=calculateTax(subTotal);

        printBill(planFee,overage,tax);
    }

    public static double calculateOverage(double overageMinutes){
        double overage = overageMinutes*0.25;
        return overage;
    }

    public static double calculateTax(double subTotal){
        double tax = subTotal*0.15;
        return tax;
    }

    public static void printBill(double planFee,double overage, double tax){
        double finalTotal=planFee+overage+tax;
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overage);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + finalTotal);
    }
}
