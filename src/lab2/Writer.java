package lab2;

import java.io.IOException;
import java.nio.file.Path;

public interface Writer {

    public void write(Path path, String content) throws IOException;
}
