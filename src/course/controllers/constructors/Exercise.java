package course.controllers.constructors;

class Animal{
    String name;
    public Animal (String name){
        this.name = name;
    }

    public Animal(){
        this.name = "Unknown Animal";
    }
}

public class Exercise {

    public static void main(String[] args) {
        System.out.println(printResults());
    }

    public static String printResults(){
        Animal animal_1 = new Animal("Tiger");
        Animal animal_2 = new Animal();
        return animal_1.name;
    }
}
