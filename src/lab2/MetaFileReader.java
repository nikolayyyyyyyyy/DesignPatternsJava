package lab2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MetaFileReader implements Reader{

    @Override
    public List<String> read(Path path) throws IOException {
        if(Files.notExists(path)){

            ErrorLogger.log("File does not exist!");
        }

        return Files.readAllLines(path);
    }
}
