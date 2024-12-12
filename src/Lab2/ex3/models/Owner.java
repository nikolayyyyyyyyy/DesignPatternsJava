package Lab2.ex3.models;

import java.util.Objects;

public class Owner extends Person{
    private String drivingLicense;

    public Owner(String egn,
                 String firstName,
                 String lastName,
                 int age) {
        super(egn, firstName, lastName, age);
        setDrivingLicense("none");
    }

    public Owner(String egn,
                 String firstName,
                 String lastName,
                 int age,
                 String drivingLicense) {
        super(egn, firstName, lastName, age);
        setDrivingLicense(drivingLicense);
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    @Override
    public boolean hasCompetence() {
        return this.getAge() >= 18 && this.getAge() <= 75 && !Objects.equals(this.drivingLicense, "none");
    }

    @Override
    public String toString() {
        return "EGN: %s First name: %s Last name: %s Age: %d Driving license: %s"
                .formatted(this.getEgn(),
                        this.getFirstName(),
                        this.getLastName(),
                        this.getAge(),
                        this.drivingLicense);
    }
}