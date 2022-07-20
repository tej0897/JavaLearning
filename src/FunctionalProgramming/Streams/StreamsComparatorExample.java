package FunctionalProgramming.Streams;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName(){

        return  StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))             //using compare with arguments.
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpa(){

        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))              //sorting using GPA
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpaReversed(){

        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())       // to get sorted result in descending order
                .collect(toList());
    }


    public static void main(String[] args) {
        System.out.println("Students sorted by NAME");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by GPA");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("Students sorted by GPA");
        sortStudentsByGpaReversed().forEach(System.out::println);

    }
}
