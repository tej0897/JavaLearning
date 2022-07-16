package course.mypackageA;
import course.mypackageB.Person;

public class ClassObjectSample {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.name = "Alex";
        alex.age = 25;
        alex.sleep();

        Person tejas = new Person();
        tejas.age = 55;
        tejas.name = "Tejas";
        tejas.sleep();

        Person harini = new Person();
        harini.age = 9;
        harini.name = "Harini";
        harini.sleep();

    }

}
