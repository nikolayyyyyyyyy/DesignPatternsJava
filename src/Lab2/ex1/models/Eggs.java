package Lab2.ex1.models;

import Lab2.ex1.enums.ItemType;

public class Eggs extends Item {
    private final int numberInPack;

    public Eggs(ItemType itemType,
                double itemPrice,
                int availableQuantity,
                int numberInPack) {
        super(itemType, itemPrice, availableQuantity);
        this.numberInPack = numberInPack;
    }

    public int getNumberInPack() {
        return numberInPack;
    }

    @Override
    public boolean needsDelivery() {
        return this.getAvailableQuantity() < 15;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.getAvailableQuantity(),o.getAvailableQuantity());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", number in pack: " + this.numberInPack;
    }
}
