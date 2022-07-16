package FunctionalProgramming.Lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        // Legacy Method:

        Comparator <Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of comparator is : " +comparator.compare(3,2));

        // using Lambdas:

        Comparator <Integer> comparator1 = (Integer a, Integer b) ->  a.compareTo(b);
        System.out.println("Result of comparator using Lambda is : " + comparator1.compare(3,4));

        // we do not have to mention the type for the input parameters. It'll take from the Comparator type and assign it to the variables
        Comparator <Integer> comparator2 = (a,b) -> a.compareTo(b);
        System.out.println("Result of comparator using Lambda is : " +comparator2.compare(5,4));
    }
}
