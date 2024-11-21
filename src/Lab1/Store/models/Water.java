package Lab1.Store.models;

import Lab1.BookLibrary.exceptions.InvalidDataException;
import Lab1.Store.enums.ItemType;

public class Water extends Item{
    private double mineralContent;

    public Water(String name,
                 int daysToExpire,
                 double availableQuantity,
                 ItemType itemType,
                 double mineralContent) {
        super(name, daysToExpire, availableQuantity, itemType);
        setMineralContent(mineralContent);
    }

    public double getMineralContent() {
        return mineralContent;
    }

    public void setMineralContent(double mineralContent) {
        if(this.mineralContent < 0){
            throw new InvalidDataException("Минерализацията не може да е негативна!");
        }
        this.mineralContent = mineralContent;
    }

    @Override
    public boolean needsDelivery() {
        return this.getAvailableQuantity() < 30 || this.getDaysToExpire() < 20;
    }
}
