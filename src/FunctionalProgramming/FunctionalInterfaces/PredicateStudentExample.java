package FunctionalProgramming.FunctionalInterfaces;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate <Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate <Student> p2 = (s) -> s.getGpa() >=3.9;

    public static void getStudentNameByGrade(){
        System.out.println("GRADE");
        List <Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (p1.test(student)){
                System.out.println(student.getName());
            }
        }));
    }

    public static void getStudentNameByGPA(){
        System.out.println("GPA");
        List <Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (p2.test(student)){
                System.out.println(student.getName());
            }
        }));
    }

    public static void filterStudents(){
        // to add both / multiple filers, AND-OR
        System.out.println("GPA and GRADE");
        List <Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (p1.and(p2).test(student)){
                System.out.println(student.getName());
            }
        }));

    }

    public static void filterStudentsWithNegate(){
        // to add both / multiple filers, AND-OR
        System.out.println("GPA and GRADE");
        List <Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (p1.and(p2).negate().test(student)){
                System.out.println(student.getName());
            }
            else {
                System.out.println(student.getName());
            }
        }));

    }



    public static void main(String[] args) {
//        getStudentNameByGrade();
//        getStudentNameByGPA();
        filterStudents();
    }
}
