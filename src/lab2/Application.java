package lab2;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {

        Creator directoryCreator = new DirectoryCreator();
        Creator textFileCreator = new TextFileCreator();
        Creator metaFileCreator = new MetaFileCreator();

        Writer textFileWriter = new TextFileWriter();
        Reader textFileReader = new TextFileReader();
        Writer metaFileWriter = new MetaFileWriter();
        Reader metaFileReader = new MetaFileReader();


        Path metaDirectory = Path.of("meta");
        Path textDirectory = Path.of("base");

        String fileName = "third.txt";
        String content = "Автор oshte metaaaaaaa";

//        directoryCreator.create(metaDirectory);
//        directoryCreator.create(textDirectory);

        switch (FileValidator.getFileType(content)){
            case TEXT:
//                textFileCreator.create(textDirectory.resolve(fileName));
                textFileWriter.write(textDirectory.resolve(fileName),content);
                List<String> lines = textFileReader.read(textDirectory.resolve(fileName));

                for (String line :
                        lines) {
                    System.out.println(line);
                }
                break;
            case META:
//                    metaFileCreator.create(metaDirectory.resolve(fileName));
                    metaFileWriter.write(metaDirectory.resolve(fileName),content);
                    List<String> metaLines = metaFileReader.read(metaDirectory.resolve(fileName));

                for (String metaFile :
                        metaLines) {

                    System.out.println(metaFile);
                }
                break;
        }
    }
}
