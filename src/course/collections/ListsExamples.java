package course.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListsExamples {
    public static void main(String[] args) {
        ArrayList <String> myList = new ArrayList();
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Banana");
        Collections.sort(myList);
        for(String fruit : myList){
            System.out.println(fruit);
        }
    }
}
