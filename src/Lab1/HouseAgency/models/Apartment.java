package Lab1.HouseAgency.models;

import Lab1.HouseAgency.enums.Parking;
import Lab1.HouseAgency.enums.PropertyType;

public class Apartment extends Property{
    private final int numberOfRooms;
    private final int numberOfFloors;
    private final Parking parkingLot;

    public Apartment(double area,
                     double price,
                     PropertyType propertyType,
                     int numberOfRooms,
                     int numberOfFloors,
                     Parking parking) {
        super(area, price, propertyType);
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        this.parkingLot = parking;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public Parking getParkingLot() {
        return parkingLot;
    }

    @Override
    public double calculateCommission() {
        if(this.getPropertyType() == PropertyType.RENT
        && this.parkingLot == Parking.ONE_PLACE_FOR_RENT ||
        this.parkingLot == Parking.TWO_PLACES_FOR_RENT){

            return this.getPrice() * 0.15;
        } else if(this.getArea() < 60){

            return this.getPrice() * 0.10;
        }
        return this.getPrice() * 0.07;
    }
}
