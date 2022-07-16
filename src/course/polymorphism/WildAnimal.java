package course.polymorphism;

public class WildAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("I eat meat");
    }

    @Override
    public void run() {
        System.out.println("I run at speed " + getMaxSpeedOfAnimal() + " KMPH");
    }
}
