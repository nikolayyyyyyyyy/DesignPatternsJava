package Lab1.Store.models;

import Lab1.BookLibrary.exceptions.InvalidDataException;
import Lab1.Store.enums.ItemType;

public class Milk extends Item{
    private double fatPercentage;

    public Milk(String name,
                int daysToExpire,
                double availableQuantity,
                ItemType itemType,
                double fatPercentage) {
        super(name, daysToExpire, availableQuantity, itemType);
        setFatPercentage(fatPercentage);
    }

    public double getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(double fatPercentage) {
        if(fatPercentage < 0){
            throw new InvalidDataException("Маслеността не може да е отрицателна!");
        }
        this.fatPercentage = fatPercentage;
    }

    @Override
    public boolean needsDelivery() {
        return this.getDaysToExpire() >= 15
                && this.getAvailableQuantity() < 10 && this.fatPercentage > 2;
    }
}
