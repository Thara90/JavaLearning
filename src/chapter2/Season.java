package chapter2;

import java.util.Scanner;

public class Season {
    public static void main(String arg[]){
        System.out.println("Enter season of the year");
        Scanner scanner = new Scanner(System.in);
        String season=scanner.next();

        System.out.println("Enter a whole number");
        int number=scanner.nextInt();

        System.out.println("Enter an adjective");
        String adjective=scanner.next();

        System.out.println("On a "+ adjective + " " + season + "day, I drink a minimum of " +number+ " cups of coffee");
    }
}
