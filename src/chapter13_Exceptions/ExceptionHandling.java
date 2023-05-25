package chapter13_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    
    public static void main(String args[]){
        //createNewFile();
        numbersExceptionHandling();
    }

/*    private static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("directory does not exists");
            e.printStackTrace(); // provide information about the error and also the path that the code took before getting there
        }
    }
}*/

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
             fileReader = new Scanner(file);

            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }
        catch (FileNotFoundException  | InputMismatchException e){
            e.printStackTrace();
        }
        finally{ // if exceptions are thrown, or if exceptions are not thrown — finally will execute.
            fileReader.close();
        }

    }
}
