package Lab1.HouseAgency.models;

import Lab1.HouseAgency.enums.Parking;
import Lab1.HouseAgency.enums.PropertyType;

public class Office extends Property{
    private final Parking parkingLot;
    private final int numberOfRooms;

    public Office(double area,
                  double price,
                  PropertyType propertyType,
                  Parking parkingLot,
                  int numberOfRooms) {
        super(area, price, propertyType);
        this.parkingLot = parkingLot;
        this.numberOfRooms = numberOfRooms;
    }

    public Parking getParkingLot() {
        return parkingLot;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    @Override
    public double calculateCommission() {
        if(this.getPropertyType() == PropertyType.RENT){

            return this.getPrice() * 0.18;
        } else if(this.parkingLot != Parking.NO_PARKING_LOT && this.numberOfRooms > 2){

            return this.getPrice() * 0.15;
        } else {

            return this.getPrice() * 0.11;
        }
    }
}
