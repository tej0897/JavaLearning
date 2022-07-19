package FunctionalProgramming.FunctionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;

        System.out.println(binaryOperator.apply(3,4));

        // to check the implementation of minBy and maxBy

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Result is: " + maxBy.apply(5, 6));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Result is: " + minBy.apply(5, 6));
    }
}
