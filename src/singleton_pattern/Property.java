package singleton_pattern;

import java.math.BigDecimal;

public class Property {

    private PropertyType type;
    private double area;
    private BigDecimal price;
    private int roomCount;
    private boolean isFurnished;
    private boolean hasGarage;
    private boolean hasParkingPlace;
    private boolean hasGarden;

    public Property(){

    }

    public PropertyType type() {
        return type;
    }

    public double area() {
        return area;
    }

    public BigDecimal price() {
        return price;
    }

    public int roomCount() {
        return roomCount;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public boolean hasParkingPlace() {
        return hasParkingPlace;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public Property setType(PropertyType type) {
        this.type = type;
        return this;
    }

    public Property setArea(double area) {
        this.area = area;
        return this;
    }

    public Property setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Property setRoomCount(int roomCount) {
        this.roomCount = roomCount;
        return this;
    }

    public Property setFurnished(boolean furnished) {
        isFurnished = furnished;
        return this;
    }

    public Property setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public Property setHasParkingPlace(boolean hasParkingPlace) {
        this.hasParkingPlace = hasParkingPlace;
        return this;
    }

    public Property setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    @Override
    public String toString() {
        return "Property{" +
                "type=" + type +
                ", area=" + area +
                ", price=" + price +
                ", roomCount=" + roomCount +
                ", isFurnished=" + isFurnished +
                ", hasGarage=" + hasGarage +
                ", hasParkingPlace=" + hasParkingPlace +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
