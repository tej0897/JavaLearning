package FunctionalProgramming.FunctionalInterfaces;

public class FunctionalExample1 {

    public static String concatStuff(String str){
        return FunctionalExample.addSomething.apply(str);
    }

    public static void main(String[] args) {
        String finalResult = concatStuff(" world");
        System.out.println(finalResult);
    }

}
