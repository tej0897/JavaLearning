package course.inhertance;

public class Humans {
    private int age;
    private String name;
    private String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sleep(){
        System.out.println(name + " sleeps for less than 7 hours");
    }

    public void walk(){
        System.out.println(name + " walks like this");
    }
}
