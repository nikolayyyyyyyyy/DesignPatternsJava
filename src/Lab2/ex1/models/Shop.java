package Lab2.ex1.models;

import Lab2.ex1.enums.ItemType;

import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private final Set<Item> items;

    public Shop(Set<Item> items) {
        this.items = items;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public int countItemsForDelivery(){
        return this.items
                .stream()
                .filter(Item::needsDelivery)
                .collect(Collectors.toSet())
                .size();
    }

    private double calculateItemPrice(){
        return this.items.stream()
                .mapToDouble(Item::getItemPrice)
                .sum();
    }

    private Item getItemWithMostAvailableQuantity(){
        return this.items
                .stream()
                .max(Comparator.comparing(Item::getAvailableQuantity))
                .orElse(null);
    }

    private ItemType getItemTypeWithLeastQuantity(){
        return Objects.requireNonNull(this.items
                .stream()
                .min(Comparator.comparing(Item::getAvailableQuantity))
                .orElse(null)).getItemType();
    }

    @Override
    public String toString() {
        return Arrays.toString(this.items.toArray());
    }
}
