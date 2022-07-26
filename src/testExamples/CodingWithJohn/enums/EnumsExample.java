package testExamples.CodingWithJohn.enums;

public class EnumsExample {
    public static void main(String[] args) {
        for (DaysOfTheWeek days : DaysOfTheWeek.values()){
            System.out.println("I study for " +days.studyHours + " hours on " +days);

        }
    }
}
