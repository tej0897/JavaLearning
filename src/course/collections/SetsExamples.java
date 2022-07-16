package course.collections;

import java.util.HashSet;

public class SetsExamples {
    public static void main(String[] args) {
        HashSet <String> mySet = new HashSet<>();
        mySet.add("Apples");
        mySet.add("Mangoes");
        mySet.add("Banana");
        System.out.println("Old basket fruits are: \n");
        for(String fruits : mySet){
            System.out.println(fruits);
        }
        HashSet <String> newSet = new HashSet<>(mySet);
        newSet.add("WaterMelons");
        newSet.add("Grapes");
        System.out.println("\n New basket fruits are: \n");
        for (String newFruits : newSet){
            System.out.println(newFruits);
        }
    }
}
