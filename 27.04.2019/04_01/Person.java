public class Person {
    private String name;
    private String address;

    public Person (String _name, String _address) {
        name = _name;
        address = _address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name = "+name+", address = "+address+"]";
    }
}
