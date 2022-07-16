package course.inhertance;

public class Musicians extends Humans {
    public void playKeyboard(){
        System.out.println(getName() + " plays keyboard since when he was a kid");
    }

    Keyboard test = new Keyboard();

    public static void main(String[] args) {
        Musicians a = new Musicians();
        a.setName("Vivek");
        a.setAge(23);
        a.setGender("Male");
        a.playKeyboard();
        a.test.playSomething();
    }
}
