package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String arg[]) {

        System.out.println("Enter the score");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();

        char grade;

        if(score>75){
            grade='A';
        }
        else if(score>65)
            grade='B';
        else if(score>55)
            grade='C';
        else if(score>35)
            grade='S';
        else
            grade='F';
        System.out.println("Your grade is " +grade);
    }
}
