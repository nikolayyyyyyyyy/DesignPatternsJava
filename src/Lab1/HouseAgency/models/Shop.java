package Lab1.HouseAgency.models;

import Lab1.HouseAgency.enums.PropertyType;

public class Shop extends Property{
    public Shop(double area,
                double price,
                PropertyType propertyType) {
        super(area, price, propertyType);
    }

    @Override
    public double calculateCommission() {
        if(this.getPropertyType() == PropertyType.RENT && this.getArea() < 50){

            return this.getPrice() * 0.02;
        } else if(this.getArea() > 100){

            return this.getPrice() * 0.01;
        } else {

            return this.getPrice() * 0.06;
        }
    }
}
