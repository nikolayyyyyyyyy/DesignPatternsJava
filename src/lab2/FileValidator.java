package lab2;

public class FileValidator {

    public static FileType getFileType(String content){

        return content.startsWith("Автор") ? FileType.META : FileType.TEXT;
    }
}
