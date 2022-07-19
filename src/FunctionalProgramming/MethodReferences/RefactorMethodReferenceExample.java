package FunctionalProgramming.MethodReferences;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static Boolean greaterThanGradeLevel( Student s){
        return s.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.supplyStudent.get()));
    }
}
