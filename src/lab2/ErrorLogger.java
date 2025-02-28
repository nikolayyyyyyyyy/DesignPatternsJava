package lab2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ErrorLogger {
    private static final String ERROR_FILE = "LocalErrors.txt";

    public static void log(String error){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ERROR_FILE,true))){

            writer.write(error);
            writer.newLine();
        }catch (IOException exception){

            System.err.println("Error happened.");
        }
    }
}
