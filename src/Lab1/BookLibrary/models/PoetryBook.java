package Lab1.BookLibrary.models;

import Lab1.BookLibrary.enums.CoverType;

import java.time.LocalDate;

public class PoetryBook extends Book{

    public PoetryBook(String title,
                      Author author,
                      LocalDate publishingYear,
                      double price,
                      CoverType coverType) {
        super(title, author, publishingYear, price, coverType);

    }

    @Override
    public double getFinalPrice() {
        return this.getPrice() + this.calculateMargin();
    }

    @Override
    public double calculateMargin() {
        if(this.getPublishingYear().isAfter(LocalDate.of(2000,12,12))
        && this.getCoverType().equals(CoverType.HARDCOVER)){

            return this.getPrice() * 0.01;
        } else {

            return this.getPrice() * 0.05;
        }
    }
}
