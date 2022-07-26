package testExamples.CodingWithJohn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        if (age == o.age){
            return 0;
        } else if (age > o.age) {
            return 1;
        }   else {
            return -1;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student tejas = new Student("Tejas", 22, "Male");
        Student vivek = new Student("Vivek", 32, "Male");
        Student harini = new Student("Harini", 22, "Female");

        students.add(tejas);
        students.add(vivek);
        students.add(harini);

        System.out.println(students);

//        Collections.sort(students);
//        System.out.println(students);

        Collections.sort(students, new ComparatorClassForIDCheck());
        System.out.println(students);
    }


}
