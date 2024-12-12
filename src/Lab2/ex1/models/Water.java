package Lab2.ex1.models;

import Lab2.ex1.enums.ItemType;
import Lab2.ex1.enums.WaterType;

public class Water extends Item {
    private final String name;
    private final WaterType waterType;

    public Water(ItemType itemType,
                 double itemPrice,
                 int availableQuantity,
                 String name,
                 WaterType waterType) {
        super(itemType, itemPrice, availableQuantity);
        this.name = name;
        this.waterType = waterType;
    }

    public String getName() {
        return name;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    @Override
    public boolean needsDelivery() {
        return this.waterType == WaterType.SODA && this.getAvailableQuantity() < 30 || this.getAvailableQuantity() < 15;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.getAvailableQuantity(),o.getAvailableQuantity());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", name: " + this.name +
                ", waterType: " + this.waterType;
    }
}