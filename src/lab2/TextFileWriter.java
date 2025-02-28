package lab2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TextFileWriter implements Writer{

    @Override
    public void write(Path path, String content) throws IOException {

        if(Files.exists(path)){

            Files.writeString(path,content + "\n", StandardOpenOption.APPEND);
        } else {
            ErrorLogger.log("File not exist.");
        }
    }
}
