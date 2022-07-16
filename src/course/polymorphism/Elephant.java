package course.polymorphism;

public class Elephant extends WildAnimal{
    @Override
    public void eat() {
        System.out.println("I eat only vegetables and fruits");
    }

    public static void main(String[] args) {
        Elephant e = new Elephant();
        e.setMaxSpeedOfAnimal(5);
        e.eat();
        e.run();
    }
}
