package Lab2.ex3.models;

import Lab2.ex3.exceptions.PersonalDataException;
import Lab2.ex3.interfaces.Competency;

import java.util.Objects;

public abstract class Person implements Competency {
    private String egn;
    private String firstName;
    private String lastName;
    private int age;

    public Person(String egn,
                  String firstName,
                  String lastName,
                  int age){
        setEgn(egn);
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        if(egn.length() != 10){

            throw new PersonalDataException("Egn is invalid");
        }
        this.egn = egn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.isEmpty() || firstName.isBlank()){

            throw new PersonalDataException("First name invalid!");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.isBlank() || lastName.isEmpty()){

            throw new PersonalDataException("Last name invalid!");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){

            throw new PersonalDataException("Age must be positive!");
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(egn, person.egn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(egn);
    }
}
