package FunctionalProgramming.Streams;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities() {

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //<Stream<String>
                .collect(toList());

        return studentActivities;
    }

    public static void main(String[] args) {
        System.out.println("Student Activities : " + printStudentActivities());
    }
}
