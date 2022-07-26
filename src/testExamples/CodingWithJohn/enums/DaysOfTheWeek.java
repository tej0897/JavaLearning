package testExamples.CodingWithJohn.enums;

public enum DaysOfTheWeek {
    SUNDAY(12),
    MONDAY(18),
    TUESDAY(12),
    WEDNESDAY(21),
    THURSDAY(19),
    FRIDAY(22),
    SATURDAY(17);

    final int studyHours;

    DaysOfTheWeek(Integer studyHours){
        this.studyHours = studyHours;
    }

}
