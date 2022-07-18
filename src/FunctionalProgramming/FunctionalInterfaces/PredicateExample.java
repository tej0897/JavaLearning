package FunctionalProgramming.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> example = (number) -> { return number % 2==0; };
    // single line return statement, no need for return keyword.
    static Predicate<Integer> exampleTwo = (n) -> n%2 ==0;
    static Predicate<Integer> exampleThree = (n) -> n%5 ==0;

    public static void multiplesOfFiveAndTwoUsingAndMethod(){
        System.out.println("And Operation's result: "+example.and(exampleThree).test(10));
        System.out.println("And Operation's result: "+example.and(exampleThree).test(11));
    }

    public static void multiplesOfFiveAndTwoUsingOrMethod(){
        System.out.println("Or Operation's result: "+example.or(exampleThree).test(10));
        System.out.println("Or Operation's result: "+example.or(exampleThree).test(4));
    }

    public static void multiplesOfFiveAndTwoUsingNegateMethod(){
        System.out.println("Or Operation's result: "+example.or(exampleThree).negate().test(10));
    }

    public static void main(String[] args) {
        multiplesOfFiveAndTwoUsingAndMethod();
        multiplesOfFiveAndTwoUsingOrMethod();
        multiplesOfFiveAndTwoUsingNegateMethod();
    }
}
