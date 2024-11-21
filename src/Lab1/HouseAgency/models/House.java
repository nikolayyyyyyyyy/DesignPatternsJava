package Lab1.HouseAgency.models;

import Lab1.HouseAgency.enums.PropertyType;

public class House extends Property{
    private final int numberOfFloors;
    private final boolean hasGarden;

    public House(double area,
                 double price,
                 PropertyType propertyType,
                 int numberOfFloors,
                 boolean hasGarden) {
        super(area, price, propertyType);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    @Override
    public double calculateCommission() {
        if(this.getPropertyType() == PropertyType.RENT && this.hasGarden){

            return this.getPrice() * 0.08;
        } else if(this.getPropertyType() == PropertyType.SALE && this.getArea() < 100){

            return this.getPrice() * 0.05;
        } else {

            return this.getPrice() * 0.03;
        }
    }
}
