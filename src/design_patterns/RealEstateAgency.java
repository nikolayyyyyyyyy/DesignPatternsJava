package design_patterns;

import java.util.HashSet;
import java.util.Set;

public class RealEstateAgency {

    private static RealEstateAgency realEstateAgency;
    private final Set<Property> properties;

    private RealEstateAgency(){
        this.properties = new HashSet<>();
    }

    public static RealEstateAgency getInstance(){
        if(realEstateAgency == null){

            realEstateAgency = new RealEstateAgency();
            return realEstateAgency;
        }
        return realEstateAgency;
    }

    public void addProperty(Property property){
        this.properties.add(property);
    }

    public void removeProperty(Property property){
        this.properties.remove(property);
    }
}
