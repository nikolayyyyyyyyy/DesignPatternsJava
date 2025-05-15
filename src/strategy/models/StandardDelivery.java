package strategy.models;

import strategy.contracts.DeliveryStrategy;

public class StandardDelivery implements DeliveryStrategy {
    private static final int fixPrice = 2;
    private final double weight;

    public StandardDelivery(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateDeliveryPrice() {
        return fixPrice + (this.weight * 1);
    }
}
