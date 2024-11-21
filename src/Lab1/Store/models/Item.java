package Lab1.Store.models;

import Lab1.BookLibrary.exceptions.InvalidDataException;
import Lab1.Store.enums.ItemType;
import Lab1.Store.interfaces.Delivery;

public abstract class Item implements Delivery {
    private String name;
    private int daysToExpire;
    private double availableQuantity;
    private ItemType itemType;

    public Item(String name,
                int daysToExpire,
                double availableQuantity,
                ItemType itemType) {
        setName(name);
        setDaysToExpire(daysToExpire);
        setAvailableQuantity(availableQuantity);
        setItemType(itemType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new InvalidDataException("Името не може да бъде празно!");
        }
        this.name = name;
    }

    public void setDaysToExpire(int daysToExpire) {
        if(daysToExpire < 0){

            throw new InvalidDataException("Не може да се подава негативно число!");
        }
        this.daysToExpire = daysToExpire;
    }

    public void setAvailableQuantity(double availableQuantity) {
        if(availableQuantity < 0){
            throw new InvalidDataException("Наличното количество не може да е негативно!");
        }
        this.availableQuantity = availableQuantity;
    }

    public void setItemType(ItemType itemType) {
        if(itemType != ItemType.FOOD && itemType != ItemType.DRINK){

            throw new InvalidDataException("Типът не е наличен!");
        }
        this.itemType = itemType;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    public double getAvailableQuantity() {
        return availableQuantity;
    }

    public ItemType getItemType() {
        return itemType;
    }
}
