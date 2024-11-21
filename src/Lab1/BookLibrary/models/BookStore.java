package Lab1.BookLibrary.models;

import java.util.Arrays;

public class BookStore {
    private final Book[] books;

    public BookStore(Book[] books){
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public double calculateTotalBookPrice(){
        return Arrays.stream(this.books)
                .mapToDouble(Book::getFinalPrice)
                .sum();
    }

    public double calculateAverageBookPrice(){
        return Arrays.stream(this.books)
                .mapToDouble(Book::getFinalPrice).average().orElse(0);
    }
}
