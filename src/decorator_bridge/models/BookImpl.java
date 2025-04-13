package decorator_bridge.models;
import decorator_bridge.interfaces.Book;
import java.math.BigDecimal;
import java.util.Set;

public class BookImpl implements Book {
    private final BigDecimal price;
    private final String resume;
    private final Set<Page> pages;

    public BookImpl(BigDecimal price, String resume, Set<Page> pages){
        this.price = price;
        this.resume = resume;
        this.pages = pages;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public String getResume() {
        return this.resume;
    }

    @Override
    public Set<Page> getPages() {
        return this.pages;
    }
}
