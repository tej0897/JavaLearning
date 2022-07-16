package course.polymorphism;

public class DomesticAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("I drink milk");
    }

    @Override
    public void run() {
        System.out.println("I run at speed " + getMaxSpeedOfAnimal() + " KMPH");
    }
}
