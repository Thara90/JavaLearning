package chapter3;
import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String arg[]) {
        int quota = 10;

        System.out.println("Enter the number of sales you made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales>=quota){
            System.out.println("Congrats! You've met the quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You were " +salesShort+ " sales short");
        }
    }
}
