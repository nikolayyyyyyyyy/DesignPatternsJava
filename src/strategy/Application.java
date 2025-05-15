package strategy;

import strategy.models.*;

public class Application {
    public static void main(String[] args) {
        DeliveryContext context = new DeliveryContext();
        context.setDeliver(new StandardDelivery(10));
        System.out.println(context.calcDeliveryPrice());

        context.setDeliver(new InternationalDelivery(10, 5));
        System.out.println(context.calcDeliveryPrice());

        context.setDeliver(new ExpressDelivery(10));
        System.out.println(context.calcDeliveryPrice());

        context.setDeliver(new EcoDelivery(60));
        System.out.println(context.calcDeliveryPrice());
    }
}
