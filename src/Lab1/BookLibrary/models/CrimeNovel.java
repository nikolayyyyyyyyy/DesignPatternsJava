package Lab1.BookLibrary.models;

import Lab1.BookLibrary.enums.CoverType;

import java.time.LocalDate;

public class CrimeNovel extends Book{

    public CrimeNovel(String title,
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
        if(this.getCoverType() == CoverType.HARDCOVER){

            return this.getPrice() * 0.02;
        } else {

            return this.getPrice() * 0.01;
        }
    }
}
