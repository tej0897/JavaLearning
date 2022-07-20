package FunctionalProgramming.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMaxExample {

    public static int calculateMax(List<Integer> listOfNumbers){
            return listOfNumbers
                    .stream()
                    .reduce(0, (a,b)-> a > b ? a : b);
    }

    public static Optional<Integer> calculateMaxUsingOptional(List<Integer> listOfNumbers){
        return listOfNumbers
                .stream()
                .reduce((a,b)-> a > b ? a : b);
    }

    public static void main(String[] args) {

        // List<Integer> listOfNumbers = Arrays.asList(5,6,7,8,9);
        List<Integer> listOfNumbers = new ArrayList<>();
        System.out.println(calculateMax(listOfNumbers));

        Optional<Integer> optionalInteger = calculateMaxUsingOptional(listOfNumbers);
        if (optionalInteger.isPresent()){
            System.out.println("Max is: " +optionalInteger.get());
        } else {
            System.out.println("The List is empty to find max");
        }
    }
}
