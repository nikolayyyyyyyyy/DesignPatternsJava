package strategy.models;

import strategy.contracts.DeliveryStrategy;

public class DeliveryContext {
    private DeliveryStrategy deliver;

    public void setDeliver(DeliveryStrategy deliver) {
        this.deliver = deliver;
    }

    public double calcDeliveryPrice() {
        return deliver.calculateDeliveryPrice();
    }
}
