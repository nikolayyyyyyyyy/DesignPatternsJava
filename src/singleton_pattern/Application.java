package singleton_pattern;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        RealEstateAgency agency = RealEstateAgency.getInstance();

        RealEstateAgency agency1 = RealEstateAgency.getInstance();

        Property house = new Property()
                .setPrice(BigDecimal.valueOf(13445))
                .setFurnished(true)
                .setHasParkingPlace(true)
                .setHasGarden(true)
                .setHasGarage(true)
                .setRoomCount(10)
                .setArea(1034)
                .setType(PropertyType.HOUSE);

        Property apartment = new Property()
                .setPrice(BigDecimal.valueOf(13445))
                .setFurnished(true)
                .setHasParkingPlace(true)
                .setHasGarden(true)
                .setHasGarage(true)
                .setRoomCount(10)
                .setArea(1034)
                .setType(PropertyType.APARTMENT);

        Property office = new Property()
                .setPrice(BigDecimal.valueOf(13445))
                .setFurnished(true)
                .setHasParkingPlace(true)
                .setHasGarden(true)
                .setHasGarage(true)
                .setRoomCount(10)
                .setArea(1034)
                .setType(PropertyType.OFFICE);

        Property office2 = new Property()
                .setPrice(BigDecimal.valueOf(13445))
                .setFurnished(true)
                .setHasParkingPlace(true)
                .setHasGarden(true)
                .setHasGarage(true)
                .setRoomCount(10)
                .setArea(1034)
                .setType(PropertyType.OFFICE);

        Property office3 = new Property()
                .setPrice(BigDecimal.valueOf(13445))
                .setFurnished(true)
                .setHasParkingPlace(true)
                .setHasGarden(true)
                .setHasGarage(true)
                .setRoomCount(10)
                .setArea(1034)
                .setType(PropertyType.OFFICE);

        Agent niki = new Agent()
                .setName("Nikolay Nikolaev")
                .setTelephoneNumber("3948397823")
                .setRealEstateAgency(agency);

        Agent nasko = new Agent()
                .setName("Atanas Genchev")
                .setTelephoneNumber("329435893492")
                .setRealEstateAgency(agency1);

        agency.addProperty(house);
        agency.addProperty(apartment);
        agency1.addProperty(office);

        niki.realEstateAgency().addProperty(office2);
        nasko.realEstateAgency().addProperty(office3);
        niki.realEstateAgency().removeProperty(office);
    }
}
