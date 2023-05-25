package chapter7_Arrays;

import java.util.Scanner;

public class Grades {
    private static  int[] num;
    private static Scanner scanner= new Scanner(System.in);

    public static void main(String arg[]) {
        System.out.println("Enter array size ");
        num = new int[scanner.nextInt()];

        getNumbers();
        double sum = getSum();
        System.out.println("Sum "+sum);
        double avg = getAvg(sum);
        System.out.println("avg "+avg);
        highetsNum();
        lowestNum();
    }

    public static void getNumbers(){
        for (int i=0; i<num.length;i++){
            System.out.println("Enter number ");
            num[i] = scanner.nextInt();
        }
    }

    public static int getSum(){
        int sum = 0;
        for (int j=0; j<num.length;j++){
            sum = sum + num[j];
        }
        return sum;
    }

    public static double getAvg(double sum){
        double avg = 0;
        avg = sum/num.length;
        return avg;
    }

    public static void highetsNum(){
        int max=num[0];
        for (int i=1; i<num.length;i++){
             if(num[i]>max){
                 max=num[i];
             }
        }
        System.out.println("Max Number "+max);
    }

    public static void lowestNum(){
        int min=num[0];
        for (int i=1; i<num.length;i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
            System.out.println("Min Number "+min);
    }
}
