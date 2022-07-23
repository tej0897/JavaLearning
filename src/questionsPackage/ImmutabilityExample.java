package questionsPackage;


/* this is a wrapper class, because of the following:
1: Instance Variables are final, we cannot change it
2: Class is final, we cannot have subclasses
3. We are not declaring setter, so instance variables cannot be changed.  / changing of instance variable is not possible.
 */


public class ImmutabilityExample {

    public static void main(String[] args) {

        Address address = new Address();

        Employee e1 = new Employee("AsBC123", address);

        e1.address.setCountry("India");
        e1.address.setCity("Bangalore");

        System.out.println(e1);

        address.setCity("test1");
        address.setCountry("test1");

        e1.getAddress().setCity("Mysore");

        System.out.println(e1);


    }
}

