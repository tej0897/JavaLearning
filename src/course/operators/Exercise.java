package course.operators;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(printStuff());
        }


    public static String printStuff() {
        int a = -11 + 5 * 2;
        int b = (87 + 4) % 7;
        int c = (33 + -2 * 9);
        int d = -8;
        return "a value : " + a + " | b value : " + b + " | c value : " + c + " | d value : " + d;
    }
}
