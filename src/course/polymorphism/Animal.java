package course.polymorphism;

public abstract class Animal {
    int maxSpeedOfAnimal;

    public int getMaxSpeedOfAnimal() {
        return maxSpeedOfAnimal;
    }

    public void setMaxSpeedOfAnimal(int maxSpeedOfAnimal) {
        this.maxSpeedOfAnimal = maxSpeedOfAnimal;
    }

    public abstract void eat();
    public abstract void run();
}
