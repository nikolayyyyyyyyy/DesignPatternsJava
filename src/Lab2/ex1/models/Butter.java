package Lab2.ex1.models;

import Lab2.ex1.enums.ItemType;

public class Butter extends Item{
    private final double packing;
    private final double butterContent;

    public Butter(ItemType itemType,
                  double itemPrice,
                  int availableQuantity,
                  double packing,
                  double butterContent) {
        super(itemType, itemPrice, availableQuantity);
        this.packing = packing;
        this.butterContent = butterContent;
    }

    public double getPacking() {
        return packing;
    }

    public double getButterContent() {
        return butterContent;
    }

    @Override
    public boolean needsDelivery() {
        return this.packing < 250 && this.getAvailableQuantity() < 20 || this.getAvailableQuantity() < 30;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.getAvailableQuantity(),o.getAvailableQuantity());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", packing: " + this.packing +
                ", butterContent: " + this.butterContent;
    }
}
