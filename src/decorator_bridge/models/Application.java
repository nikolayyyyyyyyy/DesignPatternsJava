package decorator_bridge.models;
import decorator_bridge.enums.CoverType;
import decorator_bridge.interfaces.Book;
import java.math.BigDecimal;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(10);
        String resume = "Good Book";
        Page[] pages = new Page[]{
                new Page(1,"Mnogo Tekst"),
                new Page(2,"Oshte poweche tekst"),
                new Page(3,"Final Chapter")
        };

        Book book = new BookImpl(price,resume, Set.of(pages));

        book = new EBookDecorator(book);

        System.out.println(book.getPrice());
        System.out.println(book.getResume());
        book.getPages().forEach(System.out::println);
    }
}
