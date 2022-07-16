package FunctionalProgramming.ImperativeVsDeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample {

    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<=100; i++){
            sum += i;
        }
        System.out.println("Sum using Imperative Method is :: " +sum);

        int anotherSum = IntStream.rangeClosed(1,100).sum();
        System.out.println("Sum using Declarative Method is :: " +anotherSum);
    }
}

