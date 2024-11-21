package Lab1.BookLibrary.models;

import Lab1.BookLibrary.enums.CoverType;

import java.time.LocalDate;

public class SciFiNovel extends Book{

    public SciFiNovel(String title,
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
        if(this.getCoverType() == CoverType.PAPERBACK){

            return this.getPrice() * 0.09;
        }
        return this.getPrice() * 0.12;
    }
}
