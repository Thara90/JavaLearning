package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String arg[]) {

        System.out.println("Enter the grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade) {
            case "A":
                message = "Excellent";
                break;
            case "B":
                message = "Great";
                break;
            case "C":
                message = "Good";
                break;
            default :
                message = "Invalid";
                break;
        }
        System.out.println(message);
    }
}
