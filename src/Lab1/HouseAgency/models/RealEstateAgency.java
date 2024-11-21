package Lab1.HouseAgency.models;

import Lab1.HouseAgency.enums.PropertyType;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class RealEstateAgency {
    private String name;
    private Property[] properties;

    public RealEstateAgency(String name, Property[] properties) {
        this.name = name;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public Property[] getProperties() {
        return properties;
    }

    public double calculateTotalExpectedCommission(){

        return Arrays.stream(this.properties)
                .mapToDouble(Property::calculateCommission)
                .sum();
    }

    public List<Property> getPropertiesForSale(){

        return Arrays.stream(this.properties)
                .filter(a->a.getPropertyType() == PropertyType.SALE)
                .toList();
    }
}
