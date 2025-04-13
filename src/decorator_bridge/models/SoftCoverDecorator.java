package decorator_bridge.models;
import decorator_bridge.interfaces.Book;
import java.math.BigDecimal;

public class SoftCoverDecorator extends BookDecorator{
    private final double grams;
    protected SoftCoverDecorator(Book book,double grams) {
        super(book);
        this.grams = grams;
    }

    @Override
    public BigDecimal getPrice() {
        return this.book.getPrice().add(BigDecimal.valueOf(10));
    }

    @Override
    public String getResume() {
        return this.book.getResume() + ", Soft Cover Book" + ", Grams: " + this.grams;
    }
}
