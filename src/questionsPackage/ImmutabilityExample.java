package questionsPackage;


/* this is a wrapper class, because of the following:
1: Instance Variables are final, we cannot change it
2: Class is final, we cannot have subclasses
3. We are not declaring setter, so instance variables cannot be changed.  / changing of instance variable is not possible.
 */


final class Employee{
    final String panCardNumber;

    public Employee(String panCardNumber){
        this.panCardNumber = panCardNumber;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }
}
public class ImmutabilityExample {

    public static void main(String[] args) {

        Employee e1 = new Employee("AsBC123");

        String s1 = e1.getPanCardNumber();
        System.out.println("PanCard Number is: " + s1);

    }
}

