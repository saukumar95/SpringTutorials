package SetDependentObject;

public class AddressBean {

    private String address;
    private String landmark;
    private String city;
    private String state;
    private String country;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
    @Override
    public String toString() {
        return "AddressBean{" + "address=" + address + ", landmark=" + landmark + ", city=" + city + ", state=" + state + ", country=" + country + '}';
    }
    
    
}
