package tonytest.springbootmongodb;

public class Address {
    private String city;
    private String state;

    protected Address(){}

    public Address(String city, String country) {
        this.city = city;
        this.state = country;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
