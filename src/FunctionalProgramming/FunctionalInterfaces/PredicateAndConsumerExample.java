package FunctionalProgramming.FunctionalInterfaces;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate <Student> p1 = (p) -> p.getGradeLevel() >= 3;
    static Predicate <Student> p2 = (p) -> p.getGpa() >= 3.9;
    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + ":" + activities);

    Consumer <Student> studentConsumer = (student) -> {
        if (p1.and(p2).test(student)){
            biConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public void printNameAndActivity(List <Student> list){
        list.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List <Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivity(studentList);
    }
}
