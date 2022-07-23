package questionsPackage;

public final class Employee {
    final String panCardNumber;
    final Address address;      //address is mutable


    public Employee(String panCardNumber, Address address) {
        this.panCardNumber = panCardNumber;
        Address newAddress = new Address();
        newAddress.setCity(address.getCity());
        newAddress.setCountry(address.getCountry());
        this.address = newAddress;
   //     this.address = address;

    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "panCardNumber='" + panCardNumber + '\'' +
                ", address=" + address +
                '}';
    }

    public Address getAddress() {
        Address cloneAddress = new Address();
        cloneAddress.setCity(address.getCity());
        cloneAddress.setCountry(address.getCountry());
        return cloneAddress;
    }
}
