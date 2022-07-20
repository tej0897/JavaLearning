package FunctionalProgramming.Streams;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

    private static List<String> namesUpperCase(List<Student> names){
        List<String> namesUpperCase = names.stream()    //Stream<Student>
                .map(Student::getName)                  //Stream<String>
                .map(String::toUpperCase)               // Stream<String> -> UpperCase
                .collect(toList());                     // returns List // terminal operation
        return namesUpperCase;
    }

    // same code where Set is used

    private static Set<String> namesSetUpperCase(List<Student> students){
        Set<String> namesUpperCase = students.stream()          //Stream<Student>
                .map(Student::getName)                          //Stream<String>
                .map(String::toUpperCase)                       // Stream<String> -> UpperCase
                .collect(toSet());                              // returns Set // terminal operation
        return namesUpperCase;
    }

    public static void main(String[] args) {

        System.out.println("namesUpperCase List : " + namesUpperCase(StudentDataBase.getAllStudents()));
        System.out.println("namesUpperCase Set : " + namesSetUpperCase(StudentDataBase.getAllStudents()));

    }
}
