package Lab2.ex1.models;

import Lab2.ex1.enums.ItemType;
import Lab2.ex1.interfaces.Delivery;

import java.util.Objects;

public abstract class Item implements Delivery , Comparable<Item> {
    private final ItemType itemType;
    private double itemPrice;
    private int availableQuantity;

    public Item(ItemType itemType, double itemPrice, int availableQuantity) {
        this.itemType = itemType;
        this.itemPrice = itemPrice;
        this.availableQuantity = availableQuantity;
    }



    public ItemType getItemType() {
        return itemType;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(itemPrice, item.itemPrice) == 0 && availableQuantity == item.availableQuantity && itemType == item.itemType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemType, itemPrice, availableQuantity);
    }

    @Override
    public String toString() {
        return "Item: " +
                "itemType=" + itemType +
                ", itemPrice=" + itemPrice +
                ", availableQuantity=" + availableQuantity;
    }
}
