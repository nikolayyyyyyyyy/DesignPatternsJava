package Lab2.ex3.models;

import Lab2.ex3.exceptions.CarDataException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String registrationNumber;
    private String color;
    private String brand;
    private String model;
    private String fuel;
    private final List<String> fuels = new ArrayList<>();

    public Car(String registrationNumber,
               String color,
               String brand,
               String model,
               String fuel) {
        fuels.add("petrol");
        fuels.add("diesel");
        fuels.add("PHEV");
        setRegistrationNumber(registrationNumber);
        setColor(color);
        setBrand(brand);
        setModel(model);
        setFuel(fuel);
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        if(!this.fuels.contains(fuel)){

            throw new CarDataException("Invalid input!");
        }
        this.fuel = fuel;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if(registrationNumber.isEmpty() || registrationNumber.isBlank()){

            throw new CarDataException("Invalid input!");
        }
        this.registrationNumber = registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty() || color.isBlank()){

            throw new CarDataException("Invalid input!");
        }
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.isEmpty() || brand.isBlank()){

            throw new CarDataException("Invalid input!");
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty() || model.isBlank()){

            throw new CarDataException("Invalid input!");
        }
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(registrationNumber);
    }

    @Override
    public String toString() {
        return "Car: " +
                "registrationNumber='" + registrationNumber + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'';
    }
}
