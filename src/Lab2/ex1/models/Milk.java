package Lab2.ex1.models;

import Lab2.ex1.enums.ItemType;

public class Milk extends Item{
    private final String name;
    private int daysToExpire;

    public Milk(ItemType itemType,
                double itemPrice,
                int availableQuantity,
                String name,
                int daysToExpire) {
        super(itemType, itemPrice, availableQuantity);
        this.name = name;
        this.daysToExpire = daysToExpire;
    }

    public String getName() {
        return name;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    @Override
    public boolean needsDelivery() {
        return this.daysToExpire < 7 && this.getAvailableQuantity() < 15;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.getAvailableQuantity(),o.getAvailableQuantity());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", name: " + this.name;
    }
}
