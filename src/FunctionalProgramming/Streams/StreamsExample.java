package FunctionalProgramming.Streams;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {


        Predicate<Student> gradePredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.9;

        /* Step 1: Pull the database, assign it to studentActivities and stream it, assign it accordingly, */

        Map<String,List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()               //.parallelStream don't forget.
                .filter(gpaPredicate) // Stream<Student>
                .filter(gradePredicate)     //more filters.
                .collect(Collectors.toMap(Student::getName ,Student::getActivities ));

        System.out.println("studentMap  : " + studentMap);

    }
}
