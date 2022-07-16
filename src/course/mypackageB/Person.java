package course.mypackageB;

public class Person {
        public String name;
        public int age;
        String gender;

        public void sleep() {
            if (age < 10) {
                System.out.println(name + " will sleep more than 12 hours a day");
            } else if (age >= 10 && age <= 50) {
                System.out.println(name + " will sleep less than 10 hours a day");
            } else {
                System.out.println(name+ " will sleep average of 10 hours a day");
            }
        }
}

