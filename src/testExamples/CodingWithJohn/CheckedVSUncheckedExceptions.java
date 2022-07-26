package testExamples.CodingWithJohn;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVSUncheckedExceptions {
    // checked exceptions

    public static void main(String[] args) {

        readFile("myFile.txt");     // checked exception

        //unchecked Exception
        String name = null;
        printLength(name);

    }

    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Enter the correct filename.");
        }
    }

    private static void printLength(String name) {
        System.out.println(name.length());
    }

}
