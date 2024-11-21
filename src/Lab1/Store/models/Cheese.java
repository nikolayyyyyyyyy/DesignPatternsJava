package Lab1.Store.models;

import Lab1.BookLibrary.exceptions.InvalidDataException;
import Lab1.Store.enums.ItemType;

public class Cheese extends Item{
    private double gramsPerPackage;

    public Cheese(String name,
                  int daysToExpire,
                  double availableQuantity,
                  ItemType itemType,
                  double gramsPerPackage) {
        super(name, daysToExpire, availableQuantity, itemType);
        setGramsPerPackage(gramsPerPackage);
    }

    public double getGramsPerPackage() {
        return gramsPerPackage;
    }

    public void setGramsPerPackage(double gramsPerPackage) {
        if(gramsPerPackage < 0){
        throw new InvalidDataException("Гранажът не може да е по-малък от 0!");
        }
        this.gramsPerPackage = gramsPerPackage;
    }

    @Override
    public boolean needsDelivery() {
        return this.getAvailableQuantity() < 10 && this.gramsPerPackage <= 400;
    }
}
