package lab2;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface Reader {

    public List<String> read(Path path) throws IOException;
}
