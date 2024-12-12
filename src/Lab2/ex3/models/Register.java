package Lab2.ex3.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Register {
    private final String unit;
    private final Map<Car,Owner> registeredCars;

    public Register(String unit) {
        this.unit = unit;
        this.registeredCars = new HashMap<>();
    }

    public String getUnit() {
        return unit;
    }

    public void addRegistration(Car car, Owner owner){
        if(!this.registeredCars.containsKey(car)){

            registeredCars.put(car,owner);
        }
    }
    
    public void printRegisteredCars(){
        this.registeredCars.keySet()
                .forEach(System.out::println);
    }

    public String findOwnerByRegistrationNumber(String regNum){
        for (Car car :
                this.registeredCars.keySet()) {
            if (Objects.equals(car.getRegistrationNumber(), regNum)){

                return "First name: %s Last name: %s"
                        .formatted(this.registeredCars.get(car).getFirstName(),
                                this.registeredCars.get(car).getLastName());
            }
        }

        return "Not found";
    }

    public void printLicensedDrivers(){
        this.registeredCars.values()
                .stream()
                .filter(Owner::hasCompetence)
                .forEach(System.out::println);
    }
}
