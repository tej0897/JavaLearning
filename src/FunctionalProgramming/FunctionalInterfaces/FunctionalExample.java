package FunctionalProgramming.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionalExample {

    static Function<String, String> function = (a) -> a.toUpperCase();
    static Function<String,String> addSomething = (a) -> a.toUpperCase().concat(" hehe !!!!!!!!");

    public static void main(String[] args) {

        System.out.println("Result is : " + function.apply("Hello World"));
        System.out.println("Result of AndThen is : " + function.andThen(addSomething).apply("Hello World"));
        System.out.println("Result of compose is : " + function.compose(addSomething).apply("Hello tej "));

    }
}
