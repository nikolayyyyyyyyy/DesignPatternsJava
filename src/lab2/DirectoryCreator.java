package lab2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryCreator implements Creator {
    @Override
    public void create(Path path) throws IOException {

        if(Files.notExists(path)){

            Files.createDirectory(path);
        } else {

            ErrorLogger.log("Directory already exist!");
        }
    }
}
