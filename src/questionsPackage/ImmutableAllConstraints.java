package questionsPackage;

public class ImmutableAllConstraints {
    public static void main(String[] args) {
        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1992);
        ImmutableStudent student = new ImmutableStudent(1, "Alex", age);

        System.out.println("Alex age year before modification = " + student.getAge().getYear());
        age.setYear(1993); // will cause leak of type-1
        student.getAge().setYear(1993); // will cause leak of type-2
        System.out.println("Alex age year after modification = " + student.getAge().getYear());
    }

}



