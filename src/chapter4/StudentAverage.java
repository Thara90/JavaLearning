package chapter4;
import java.util.Scanner;

public class StudentAverage {
    public static void main(String arg[]) {
        int numberOfStudents = 24;
        int numberOfTests = 4;

        for(int i=0;i<=numberOfStudents;i++){

            int total = 0;
            for(int j=0;j<numberOfTests;j++){
                System.out.println("Enter test "+(j+1)+" score");
                Scanner scanner = new Scanner(System.in);
                int score = scanner.nextInt();
                total = total + score;
            }
            System.out.println("Avergae of Student " +(i+1) + " is " +total/4);
        }

    }
}
