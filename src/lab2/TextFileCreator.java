package lab2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileCreator implements Creator{

    @Override
    public void create(Path path) throws IOException {

        if(Files.notExists(path)){

            Files.createFile(path);
        } else {

            ErrorLogger.log("File already exist!");
        }
    }
}
