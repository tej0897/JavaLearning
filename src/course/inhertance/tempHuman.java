package course.inhertance;

public class tempHuman {
    public static void letsWalk(Humans h){
        h.walk();
    }

    public static void main(String[] args) {
        Artists a = new Artists();
        a.setName("Tej");

        Musicians b = new Musicians();
        b.setName("Vivek");

        letsWalk(a);
        letsWalk(b);
    }
}
