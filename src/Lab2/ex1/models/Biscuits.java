package Lab2.ex1.models;

import Lab2.ex1.enums.ItemType;

public class Biscuits extends Item{
    private final String name;

    public Biscuits(ItemType itemType,
                    double itemPrice,
                    int availableQuantity,
                    String name) {
        super(itemType, itemPrice, availableQuantity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean needsDelivery() {
        return this.getAvailableQuantity() < 5;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.getAvailableQuantity(),o.getAvailableQuantity());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", name:" + this.name;
    }
}
