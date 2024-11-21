package Lab1.Bar.models;

import Lab1.Bar.enums.Fragrances;

public class SoftDrink extends Drink{
    private boolean isSugarFree;
    private Fragrances drinkFragrance;

    public SoftDrink(String name,
                     int quantity,
                     int serveQuantity,
                     boolean isSugarFree,
                     Fragrances drinkFragrance) {
        super(name, quantity, serveQuantity);
        this.isSugarFree = isSugarFree;
        this.drinkFragrance = drinkFragrance;
    }

    public Fragrances getDrinkFragrance() {
        return drinkFragrance;
    }

    public boolean isSugarFree() {
        return isSugarFree;
    }

    @Override
    public boolean needOfDelivery() {
        return this.getQuantity() <= 10;
    }

    @Override
    public void deliver(int quantity) {
        this.addQuantity(quantity);
    }

    @Override
    public void serve(int quantity) {
        this.decreaseQuantity(quantity);
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "needOfDeliver:" + this.needOfDelivery();
    }
}
