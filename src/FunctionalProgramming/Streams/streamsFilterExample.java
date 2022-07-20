package FunctionalProgramming.Streams;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class streamsFilterExample {

    public static List<Student> filterStudents(){

        List<Student> filteredStudentList = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .filter(student -> student.getGender().equals("female"))
                .collect(toList());

        return filteredStudentList;
    }

    public static void main(String[] args) {
        System.out.println("Filtered Students : ");
        filterStudents().forEach(System.out::println);
    }
}
