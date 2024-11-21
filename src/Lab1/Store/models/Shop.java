package Lab1.Store.models;

import Lab1.Store.enums.ItemType;
import Lab1.Store.interfaces.Delivery;

import java.util.Arrays;

public class Shop {
    private final Item[] items;

    public Shop(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public int getItemCountDelivery(){

        return (int)Arrays.stream(this.items).filter(Delivery::needsDelivery).count();
    }

    public double getAverageDaysToExpire(){
        return Arrays.stream(this.items)
                .mapToDouble(Item::getDaysToExpire)
                .average()
                .orElse(0);
    }

    public int getAvailableDrinksCount(){
        return (int)Arrays.stream(this.items).filter(a->a.getItemType() == ItemType.DRINK).count();
    }
}
