package testExamples.CodingWithJohn;

import java.util.Comparator;

public class ComparatorClassForIDCheck implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() == o1.getAge()){
            return o1.getName().compareTo(o2.getName());
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        }   else {
            return -1;
        }
    }
}
