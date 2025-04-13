package decorator_bridge.models;
import decorator_bridge.enums.CoverType;
import decorator_bridge.interfaces.Book;
import java.math.BigDecimal;

public class HardCoverBook extends BookDecorator{
    private final double grams;
    private final CoverType coverType;

    protected HardCoverBook(Book book, double grams,CoverType coverType) {
        super(book);
        this.grams = grams;
        this.coverType = coverType;
    }

    @Override
    public BigDecimal getPrice() {
        return this.book.getPrice().add(BigDecimal.valueOf(25));
    }

    @Override
    public String getResume() {
        return this.book.getResume() + ", Grams: " + this.grams + ", CoverType: " + this.coverType;
    }
}
