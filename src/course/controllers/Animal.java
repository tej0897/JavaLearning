package course.controllers;

class Animals{
    // Write your animal class attribute and constructors here.
    String name;
    public Animals(String name){
        this.name = name;
    }

    public Animals(){
        this.name = "Unknown Animal";
    }

}

public class Animal {

    public static void main(String[] args) {
        System.out.println(printResult());
    }

    public static String printResult(){
        // Write your logic here to return expected patter as string
        // Expected Result : animal_1 name : Tiger | animal_2 name : Unknown Animal
        Animals animal_1 = new Animals("Tiger");
        Animals animal_2 = new Animals();

        return "animal_1 name : " +animal_1 + " | animal_2 name : " + animal_2;

    }
}

