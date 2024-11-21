package Lab1.BookLibrary.models;
import Lab1.BookLibrary.enums.CoverType;
import Lab1.BookLibrary.exceptions.InvalidDataException;
import Lab1.BookLibrary.interfaces.Margin;
import java.time.LocalDate;

public abstract class Book implements Margin {
    private String title;
    private Author author;
    private final LocalDate publishingYear;
    private double price;
    private final CoverType coverType;

    public Book(String title,
                Author author,
                LocalDate publishingYear,
                double price,
                CoverType coverType) {
        setTitle(title);
        setAuthor(author);
        this.publishingYear = publishingYear;
        setPrice(price);
        this.coverType = coverType;
    }

    public void setTitle(String title) {
        if(this.title.isEmpty()){
            throw new InvalidDataException("Заглавието не може да бъде празно!");
        }
        this.title = title;
    }

    public void setAuthor(Author author) {
        if(this.author == null){

            throw new InvalidDataException("Авторът е задължителен!");
        }
        this.author = author;
    }

    public void setPrice(double price) {
        if(this.price < 5){
            throw new InvalidDataException("Цената не може да е под 5 лв!");
        }
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public LocalDate getPublishingYear() {
        return publishingYear;
    }

    public double getPrice() {
        return price;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public abstract double getFinalPrice();

    @Override
    public String toString() {
        return "Title='" + title + '\'' +
                ", Author=" + author +
                ", PublishingYear=" + publishingYear +
                ", Price=" + price +
                ", CoverType=" + coverType;
    }
}
