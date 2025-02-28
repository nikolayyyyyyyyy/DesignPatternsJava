package lab2;

import java.io.IOException;
import java.nio.file.Path;

public interface Creator {

    public void create(Path path) throws IOException;
}
