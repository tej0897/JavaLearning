package revisionNotes.JavaBasics.MethodsAndVariables;

public class Test {
    public static void main(String[] args) {
        Employee tejas = new Employee();
        Employee vivek = new Employee();
        Employee harini = new Employee();
        vivek.name = "Vivek";
        harini.name = "Harini";
        tejas.name = "Tejas";

        Employee [] listOfUsers = new Employee[3];
        listOfUsers[0] = tejas;
        listOfUsers[1] = vivek;
        listOfUsers[2] = harini;

        System.out.println("Name of employee at index 0 is : " +listOfUsers[0].name);
        System.out.println("Name of employee at index 1 is : " +listOfUsers[1].name);
        System.out.println("Name of employee at index 2 is : " +listOfUsers[2].name);

    }
}
