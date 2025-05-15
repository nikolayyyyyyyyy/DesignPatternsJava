package strategy.models;

import strategy.contracts.DeliveryStrategy;

public class InternationalDelivery implements DeliveryStrategy {
    private static final double fixPrice = 10;
    private final double weight;
    private final double extraMoneyForBorders;

    public InternationalDelivery(double weight, double extraMoneyForBorders) {
        this.weight = weight;
        this.extraMoneyForBorders = extraMoneyForBorders;
    }

    @Override
    public double calculateDeliveryPrice() {
        return fixPrice + (this.weight * 5) + this.extraMoneyForBorders;
    }
}
