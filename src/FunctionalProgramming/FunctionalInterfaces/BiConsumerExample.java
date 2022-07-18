package FunctionalProgramming.FunctionalInterfaces;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;


public class BiConsumerExample {

    public static void getNamesAndActivities(){
        BiConsumer <String, List<String>> biConsumer = (name, activity) -> System.out.println("Name: " +name+ "\n Activities:" +activity);
        List <Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach( student -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String>  biConsumer = (a,b) -> {
            System.out.println("The value of a: " + a +"\nThe value of b: " +b);
        };
        biConsumer.accept("Hello", "World");

        BiConsumer<Integer, Integer> biConsumer1 = (a,b) -> {
            System.out.println("Multiplication is : "+a * b);
        };

        BiConsumer<Integer, Integer> biConsumer2 = (a,b) -> {
            System.out.println("Division is : "+a / b);
        };

        biConsumer1.andThen(biConsumer2).accept(10,5);

        // concept of using andThen() for chaining purposes in called "CONSUMER-CHAINING"

        getNamesAndActivities();
    }
}
