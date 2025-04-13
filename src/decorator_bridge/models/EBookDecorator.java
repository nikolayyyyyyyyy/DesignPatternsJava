package decorator_bridge.models;
import decorator_bridge.interfaces.Book;
import java.math.BigDecimal;

public class EBookDecorator extends BookDecorator{
    protected EBookDecorator(Book book) {
        super(book);
    }

    @Override
    public BigDecimal getPrice() {
        return this.book.getPrice().add(BigDecimal.valueOf(5));
    }

    @Override
    public String getResume() {
        return this.book.getResume() + ", WEB book";
    }
}
