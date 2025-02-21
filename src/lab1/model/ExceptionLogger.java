package lab1.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ExceptionLogger {
    private static final String ERROR_FILE = "Error.txt";

    public static void saveError(String cause){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ERROR_FILE,true ))) {

            writer.write(new Date() + " --> " + cause);
            writer.newLine();
        } catch (IOException exception){
            System.err.println("Error logging message: " + exception.getMessage());
        }

    }
}
