package Lab2.ex1.models;

import Lab2.ex1.enums.ItemType;

public class Chocolate extends Item{
    private final String name;
    private final double cocoaContent;

    public Chocolate(ItemType itemType,
                     double itemPrice,
                     int availableQuantity,
                     String name,
                     double cocoaContent) {
        super(itemType, itemPrice, availableQuantity);
        this.name = name;
        this.cocoaContent = cocoaContent;
    }

    public String getName() {
        return name;
    }

    public double getCocoaContent() {
        return cocoaContent;
    }

    @Override
    public boolean needsDelivery() {
        return this.getAvailableQuantity() < 10;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.getAvailableQuantity(),o.getAvailableQuantity());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", name: " + this.name +
                ", cocoaContent: " + this.cocoaContent;
    }
}
