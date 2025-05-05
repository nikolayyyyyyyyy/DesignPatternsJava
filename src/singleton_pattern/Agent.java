package singleton_pattern;

public class Agent {
    private String name;
    private String telephoneNumber;
    private RealEstateAgency realEstateAgency;

    public Agent(){

    }

    public Agent setName(String name) {
        this.name = name;
        return this;
    }

    public Agent setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }

    public Agent setRealEstateAgency(RealEstateAgency realEstateAgency) {
        this.realEstateAgency = realEstateAgency;
        return this;
    }

    public String name() {
        return name;
    }

    public String telephoneNumber() {
        return telephoneNumber;
    }

    public RealEstateAgency realEstateAgency() {
        return realEstateAgency;
    }
}
