package Lab1.BookLibrary.models;

public class Author {
    private final String firstName;
    private final String lastName;
    private final String Country;

    public Author(String firstName, String lastName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        Country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCountry() {
        return Country;
    }

    public String getLastName() {
        return lastName;
    }
}
