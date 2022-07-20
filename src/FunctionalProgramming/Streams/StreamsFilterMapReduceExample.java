package FunctionalProgramming.Streams;

import FunctionalProgramming.Student;
import FunctionalProgramming.StudentDataBase;

public class StreamsFilterMapReduceExample {

    private static int noOfNoteBooks(){

        int totalNoOfnoteBooks = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equalsIgnoreCase("Female"))
                .map((Student::getNoteBooks))
                .reduce(0,Integer::sum);
        return  totalNoOfnoteBooks;

    }

    public static void main(String[] args) {
        System.out.println("Total No of NoteBooks are : " + noOfNoteBooks());
    }
}
