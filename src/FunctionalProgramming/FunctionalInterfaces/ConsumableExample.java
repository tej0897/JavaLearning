package FunctionalProgramming.FunctionalInterfaces;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumableExample {
    static Consumer<Student> example2 = (student) -> System.out.println(student);
    static Consumer <Student> printNames = (StudentNameInput) -> System.out.println(StudentNameInput.getName());
    static Consumer <Student> printActivities = (StudentActInput) -> System.out.println(StudentActInput.getActivities());

    public static void getNames() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(example2);
    }

    public static void printNameAndActivity(){
        List <Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(printNames.andThen(printActivities));
    }

    public static void printNamesWithCondition(){
        List <Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach( (student) -> {
            if (student.getGradeLevel() >=3) {
                printNames.andThen(printActivities).accept(student);
            }
                }
        );
    }


    public static void main(String[] args) {

        Consumer<String> example = (s) -> System.out.println(s.toUpperCase());
        example.accept("hello world");

        //printNameAndActivity();
        printNamesWithCondition();
    }


}
