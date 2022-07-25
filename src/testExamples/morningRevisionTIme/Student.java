package testExamples.morningRevisionTIme;


public class Student {

        private final int age;
        private final String name;
        private final Address address;

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public Address getAddress() {
            return address;
        }

    public Student(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        Address copyAddress = new Address(address.getCity(),address.getCountry());
        copyAddress.setCity(address.getCity());
        copyAddress.setCountry(address.getCountry());
        this.address = copyAddress;
    }

    public static void main(String[] args) {

        Student tejas = new Student(22,"Tejas", new Address("Bangalore", "India"));
        System.out.println(tejas.getName());
        System.out.println(tejas.getAddress());
        tejas.address.setCity("Mysore");
        System.out.println(tejas.getAddress());
    }

}
