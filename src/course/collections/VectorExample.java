package course.collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> myList = new Vector<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        for (String s : myList){
            System.out.println(s);
        }
    }
}
