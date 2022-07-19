package FunctionalProgramming.MethodReferences;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> consumer1 = (s) -> System.out.println(s);

    static Consumer<Student> consumer2 = System.out::println;
    static Consumer<Student> consumer = Student::printListOfActivities;     // calling user-defined methods

    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(consumer1);
        StudentDataBase.getAllStudents().forEach(consumer);

    }
}
