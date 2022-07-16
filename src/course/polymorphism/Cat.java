package course.polymorphism;

public class Cat extends DomesticAnimal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat meat as well");
    }

    public void run(boolean ifDanger){
        if (ifDanger){
            System.out.println("I run at 50 KMPH when in danger");
        }
        else {
            System.out.println("I run at speed " + getMaxSpeedOfAnimal() + " KMPH");
        }
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setMaxSpeedOfAnimal(20);
        c.run(true);
        c.eat();
    }
}
