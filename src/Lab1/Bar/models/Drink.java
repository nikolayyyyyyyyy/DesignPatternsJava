package Lab1.Bar.models;

import Lab1.Bar.interfaces.Delivery;
import Lab1.Bar.interfaces.Serving;

public abstract class Drink implements Delivery, Serving {

    private final String name;
    private int quantity;
    private final int serveQuantity;

    public Drink(String name, int quantity, int serveQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.serveQuantity = serveQuantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getServeQuantity() {
        return serveQuantity;
    }

    public void addQuantity(int quantity){
        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity){
        if(quantity > this.quantity){
            this.quantity = 0;
        } else {
            this.quantity -= quantity;
        }
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", quantity=" + quantity;
    }
}
