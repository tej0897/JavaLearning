package FunctionalProgramming.ImperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,2,3,3,4,5,5,6,7,7,7,8,8,9);

        // Imperative Method

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer integer: integerList){
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println(uniqueList);

        //Declarative Method
        List<Integer> anotherList = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(anotherList);
    }
}
