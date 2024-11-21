package Lab1.Bar.models;

import Lab1.Bar.exceptions.BarException;

public class AlcoholicBeverage extends Drink{
    private double vol;

    public AlcoholicBeverage(String name,
                             int quantity,
                             int serveQuantity,
                             double vol) {
        super(name, quantity, serveQuantity);
        this.vol = vol;
    }

    public double getVol() {
        return vol;
    }

    @Override
    public boolean needOfDelivery() {
        return this.getQuantity() <= 5;
    }

    @Override
    public void deliver(int quantity) {
        this.addQuantity(quantity);
    }

    @Override
    public void serve(int quantity) {
        this.decreaseQuantity(quantity);
    }

    public boolean isProper(int years){

        if(years < 18){
            if(years < 0){
                throw new BarException("Въведена е невалидна възраст");
            }
            throw new BarException("Лица под 18 г. не могат да консумират алкохолни напитки");
        }


        if(years <= 21 || years > 70){
            return this.vol < 10;
        }

        return true;
    }


    @Override
    public String toString() {
        return super.toString() + "\n"
                + "needOfDeliver:" + this.needOfDelivery();
    }
}
