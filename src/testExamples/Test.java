package testExamples;

public class Test {
    public static void main(String[] args) {
        Employee tejas = new Employee("ABC123@!@");
        String result  = tejas.getPanCardNumber();
        System.out.println("Pancard Number of the user is : " + result);
    }
}

final class Employee{
    final String panCardNumber;

    public Employee ( String panCardNumber){
        this.panCardNumber = panCardNumber;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }
}
