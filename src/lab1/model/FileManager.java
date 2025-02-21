package lab1.model;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileManager {

    public static void saveKey(String fileName,String key){

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))){

            writer.write(key);
            writer.newLine();
        } catch (IOException exception){

            ExceptionLogger.saveError("Error verifying: " + exception.getMessage());
        }

    }

    public static boolean verifyAndRemoveKey(String fileName,String key){
        try {
            List<String> rows = Files
                    .readAllLines(Paths.get(fileName));

            if(rows.contains(key)){
                rows.remove(key);
                Files.write(Paths.get(fileName),rows);
                return true;
            }
        }catch (IOException exception){

            ExceptionLogger.saveError("Error verifying key: " + exception.getMessage());
        }
        return false;
    }
}
