package decorator_bridge.models;
import decorator_bridge.interfaces.Book;
import java.util.Set;

public abstract class BookDecorator implements Book {
    protected Book book;

    protected BookDecorator(Book book){
        this.book = book;
    }

    @Override
    public Set<Page> getPages() {
        return book.getPages();
    }
}
