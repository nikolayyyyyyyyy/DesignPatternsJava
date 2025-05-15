package strategy.models;

import strategy.contracts.DeliveryStrategy;

public class EcoDelivery implements DeliveryStrategy {
    private static final int fixPrice = 4;
    private final double weight;

    public EcoDelivery(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateDeliveryPrice() {
        if (this.weight <= 5) {

            return (double) fixPrice / 2;
        } else {

            return fixPrice;
        }
    }
}
