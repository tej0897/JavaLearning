package course.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> myQueue = new PriorityQueue<>();
        myQueue.add("Mangoes");
        myQueue.add("Apple");
        myQueue.add("Banana");
        myQueue.add("Grape");
        myQueue.poll();
        for (String fruits: myQueue){
            System.out.println(fruits);
        }
    }
}
