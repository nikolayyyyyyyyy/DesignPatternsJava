package Lab1.ex4.models;

import Lab1.ex4.enums.FishType;

public abstract class Fish {
    private final FishType name;
    private final double quantity;

    public Fish(FishType name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public FishType getName() {
        return name;
    }


    public double getQuantity() {
        return quantity;
    }

}
