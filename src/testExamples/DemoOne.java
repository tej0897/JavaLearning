package testExamples;

public class DemoOne {
    public static void main(String[] args) {
        String s1 = "abc";                     // will check if any abc is present, if exists, then it'll refer to that only. Else will create a new one
        String s2 = "abc";  // created new instance always (when new is used)
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
