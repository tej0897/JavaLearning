package FunctionalProgramming.Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        for(String name : names){
            System.out.println("1: "+name);           //external traversing, using name variable
        }

        for(String name : names){
            System.out.println("2: "+name);           //re-running the iteration again in Collections, which is not possible in Streams.
        }

        Stream<String> namesInStream = names.stream();
        namesInStream.forEach(System.out::println);

        //namesInStream.forEach(System.out::println);
        // it'll throw an exception "stream has already been operated upon or closed"


    }
}
