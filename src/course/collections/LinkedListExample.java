package course.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList <String> myList = new LinkedList<>();
        myList.add("a");
        myList.add("f");
        myList.addFirst("z");
        myList.addLast("t");
        myList.add("b");
        myList.removeLast();
        for(String s : myList){
            System.out.println(s);
        }
    }
}
