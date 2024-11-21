package Lab1.HouseAgency.models;

import Lab1.BookLibrary.exceptions.InvalidDataException;
import Lab1.HouseAgency.enums.PropertyType;
import Lab1.HouseAgency.interfaces.Commission;

public abstract class Property implements Commission {

    private double area;
    private double price;
    private PropertyType propertyType;

    public Property(double area, double price, PropertyType propertyType) {
        this.area = area;
        this.price = price;
        setPropertyType(propertyType);
    }

    public double getArea() {
        return area;
    }

    public void setPropertyType(PropertyType propertyType) {
        if(propertyType != PropertyType.RENT
        && propertyType != PropertyType.SALE
        && propertyType != PropertyType.UNDEFINED){
            throw new InvalidDataException("Типа на имота не съответства!");
        }
        this.propertyType = propertyType;
    }

    public double getPrice() {
        return price;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }
}
