package chapter13_Exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling2 {

    public static void main(String args[]) throws IOException {
        createNewFileRethrow();
    }

    public static void createNewFileRethrow() throws IOException { //I know that this might throw an exception, but I don't want to handle that exception. I would like to just rethrow the exception.
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }
}
