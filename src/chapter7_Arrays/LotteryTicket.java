package chapter7_Arrays;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH=6;
    private static final int MAX_TICKET_LENGTH=69;

    public static void main(String arg[]) {
        int[] ticket=generateNumbers();
        printNumbers(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            ticket[i]= random.nextInt(MAX_TICKET_LENGTH);
        }
        return ticket;
    }

    public static void printNumbers(int[] ticket) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(ticket[i]);
        }
    }

}

