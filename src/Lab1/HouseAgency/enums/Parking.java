package Lab1.HouseAgency.enums;

public enum Parking {

    NO_PARKING_LOT(0, PropertyType.UNDEFINED),
    ONE_PLACE_FOR_RENT(1, PropertyType.RENT),
    ONE_PLACE_FOR_SALE(1, PropertyType.SALE),
    TWO_PLACES_FOR_RENT(2, PropertyType.RENT ),
    TWO_PLACES_FOR_SALE(2, PropertyType.SALE),
    PLACES_FOR_RENT(100, PropertyType.RENT ),
    PLACES_FOR_SALE(100, PropertyType.SALE);

    private final int numberOfParkingPlaces;
    private final PropertyType propertyType;

    Parking(int numberOfParkingPlaces, PropertyType propertyType) {
        this.numberOfParkingPlaces = numberOfParkingPlaces;
        this.propertyType = propertyType;
    }

    public int getNumberOfParkingPlaces() {
        return numberOfParkingPlaces;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }
}
