package Lab2.ex5;

import java.util.Arrays;

public abstract class Person {
    private String name;

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String[] input =  name.split(" ");
        if(input.length < 2
        || !Character.isUpperCase(input[0].charAt(0))
        || !Character.isUpperCase(input[1].charAt(0))){

            throw new PersonExeption("Invalid name!");
        }
        this.name = name;
    }
}
