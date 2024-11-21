package Lab1.Store.models;

import Lab1.BookLibrary.exceptions.InvalidDataException;
import Lab1.Store.enums.ItemType;

public class Bread extends Item{
    private double whiteFlourPercentage;

    public Bread(String name,
                 int daysToExpire,
                 double availableQuantity,
                 ItemType itemType,
                 double whiteFlourPercentage) {
        super(name, daysToExpire, availableQuantity, itemType);
        setAvailableQuantity(whiteFlourPercentage);
    }

    public double getWhiteFlourPercentage() {
        return whiteFlourPercentage;
    }

    public void setWhiteFlourPercentage(double whiteFlourPercentage) {
        if(whiteFlourPercentage < 0){
            throw new InvalidDataException("Наличното бяло брашно не може да е негативно число!");
        }
        this.whiteFlourPercentage = whiteFlourPercentage;
    }

    @Override
    public boolean needsDelivery() {
        return this.getDaysToExpire() < 5 && this.whiteFlourPercentage > 75
                || this.getAvailableQuantity() < 10;
    }
}
