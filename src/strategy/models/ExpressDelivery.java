package strategy.models;

import strategy.contracts.DeliveryStrategy;

public class ExpressDelivery implements DeliveryStrategy {
    private static final int fixPrice = 3;
    private final double weight;

    public ExpressDelivery(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateDeliveryPrice() {
        return fixPrice + (this.weight * 2.5);
    }
}
